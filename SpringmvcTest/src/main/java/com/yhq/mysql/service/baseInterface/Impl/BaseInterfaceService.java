/**
 * 
 */
package com.yhq.mysql.service.baseInterface.Impl;

import com.yhq.mysql.MySqlMapper;
import com.yhq.mysql.service.baseInterface.IBaseInterfaceService;

/**
 * @author YHQ
 * @ClassName BaseInterfaceService
 * @Version
 * @date 2016-9-27 下午1:39:20
 */
public class BaseInterfaceService<T extends Object> implements IBaseInterfaceService<T> {

	private MySqlMapper<T> mySqlMapper;

	public MySqlMapper<T> getMySqlMapper() {
		return mySqlMapper;
	}

	public void setMySqlMapper(MySqlMapper<T> mySqlMapper) {
		this.mySqlMapper = mySqlMapper;
	}

	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(T record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(T record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public T selectByPrimaryKey(Long id) {
		return mySqlMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(T record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(T record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
