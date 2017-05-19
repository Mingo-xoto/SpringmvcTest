/**
 * 
 */
package com.yhq.sqlserver.service.baseInterface;

import java.util.List;

import org.springframework.ui.ModelMap;

/**
 * @author YHQ
 * @ClassName BaseInterface
 * @Version
 * @date 2016-9-23 下午12:58:59
 */
public interface IBaseInterface<T extends Object> {

	/**
	 * 查询指定市中心数据
	 * 
	 * @author YHQ
	 * @date 2016-9-23 下午4:15:42
	 * @param @param centerId
	 * @param @return 设定文件
	 * @param centerId
	 * @return
	 */
	public List<T> selectByCenterId(String centerId);

	/**
	 * 多线程分批读取
	 * 
	 * @author YHQ
	 * @date 2016-9-23 下午4:15:06
	 * @param @param map 设定文件
	 * @param map
	 */
	public void multiThreadRead(ModelMap map);

	/**
	 * 单线程分批顺序读取
	 * 
	 * @author YHQ
	 * @date 2016-9-23 下午4:15:21
	 * @param @param map 设定文件
	 * @param map
	 */
	public void singleThreadRead(ModelMap map);

	/**
	 * 一次性读取
	 * 
	 * @author YHQ
	 * @date 2016-9-23 下午4:15:33
	 * @param @param map 设定文件
	 * @param map
	 */
	public void ReadAll(ModelMap map);
}
