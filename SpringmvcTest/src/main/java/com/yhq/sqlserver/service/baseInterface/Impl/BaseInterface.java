/**
 * 
 */
package com.yhq.sqlserver.service.baseInterface.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.ui.ModelMap;

import com.yhq.sqlserver.SqlServerMapper;
import com.yhq.sqlserver.service.baseInterface.IBaseInterface;

/**
 * @author YHQ
 * @ClassName BaseInterface
 * @Version
 * @date 2016-9-23 下午2:24:51
 */
public class BaseInterface<T extends Object> implements IBaseInterface<T> {

	private SqlServerMapper<T> serverMapper;

	public SqlServerMapper<T> getServerMapper() {
		return serverMapper;
	}

	public void setServerMapper(SqlServerMapper<T> serverMapper) {
//		System.out.println("serverMapper:"+serverMapper);
		this.serverMapper = serverMapper;
	}

	public List<T> selectByCenterId(String centerId) {
		return serverMapper.selectByCenterId(centerId);
	}

	public void multiThreadRead(ModelMap map) {
		System.out.println("----------------多线程分批读取开始----------------");
		long t1 = new Date().getTime();
		System.out.println("开始时间：" + t1);
		List<Map<String, T>> websiteList = new ArrayList<Map<String, T>>();
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(22);
		for (int i = 1; i < 23; i++) {
			// 增加标记
			final int index = i;
			final Map<String, T> map1 = new HashMap<String, T>();
			final String centerId = i < 10 ? "0" + i : i + "";
			fixedThreadPool.execute(new Runnable() {
				public void run() {
					map1.put(centerId, selectByCenterId(centerId).get(0));
					System.out.println(index);
					// 去掉标记
					System.out.println("子线程：index，" + Thread.currentThread() + "执行完毕");
				}
			});
			websiteList.add(map1);
		}
		// 启动一次顺序关闭，执行以前提交的任务，但不接受新任务。
		// System.out.println("已经开启所有的子线程");
		fixedThreadPool.shutdown();
		// System.out.println("shutdown()：启动一次顺序关闭，执行以前提交的任务，但不接受新任务。");
		while (true) {
			if (fixedThreadPool.isTerminated()) {
				System.out.println("所有的子线程都结束了！");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("主线执行。");
		map.put("websiteList ", websiteList);

		long t2 = new Date().getTime();
		System.out.println("结束时间:" + t2);
		System.out.println("时间差:" + (t2 - t1));
		System.out.println("----------------多线程分批读取结束----------------");
	}

	public void singleThreadRead(ModelMap map) {
		System.out.println("----------------单线程分批读取开始----------------");
		long t1 = new Date().getTime();
		System.out.println("开始时间：" + t1);
		List<Map<String, T>> websiteList = new ArrayList<Map<String, T>>();
		for (int i = 1; i < 23; i++) {
			final Map<String, T> map1 = new HashMap<String, T>();
			final String centerId = i < 10 ? "0" + i : i + "";
			try {
				map1.put(centerId, selectByCenterId(centerId).get(0));
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			websiteList.add(map1);
		}
		map.put("websiteList ", websiteList);

		long t2 = new Date().getTime();
		System.out.println("结束时间:" + t2);
		System.out.println("时间差:" + (t2 - t1));
		System.out.println("----------------单线程分批读取结束----------------");
	}

	public void ReadAll(ModelMap map) {
		System.out.println("----------------一次性读取开始----------------");
		long t1 = new Date().getTime();
		System.out.println("开始时间：" + t1);
		List<Map<String, T>> websiteList = new ArrayList<Map<String, T>>();
		final Map<String, T> map1 = new HashMap<String, T>();
		try {
			map1.put("省中心", selectByCenterId(null).get(0));
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		websiteList.add(map1);
		map.put("websiteList ", websiteList);

		long t2 = new Date().getTime();
		System.out.println("结束时间:" + t2);
		System.out.println("时间差:" + (t2 - t1));
		System.out.println("----------------一次性读取结束----------------");
	}

}
