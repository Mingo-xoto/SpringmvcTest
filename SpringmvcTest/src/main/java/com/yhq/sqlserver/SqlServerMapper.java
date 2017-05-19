/**
 * 
 */
package com.yhq.sqlserver;

import java.util.List;

/**
 * @author YHQ
 * @ClassName SqlServerMapper
 * @Version
 * @date 2016-9-22 上午10:54:31
 */
public interface SqlServerMapper<T extends Object> {
	/**
	 * * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table wd
	 * 
	 * @mbggenerated Thu Sep 22 15:20:33 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table wd
	 * 
	 * @mbggenerated Thu Sep 22 15:20:33 CST 2016
	 */
	int insert(T record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table wd
	 * 
	 * @mbggenerated Thu Sep 22 15:20:33 CST 2016
	 */
	int insertSelective(T record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table wd
	 * 
	 * @mbggenerated Thu Sep 22 15:20:33 CST 2016
	 */
	T selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table wd
	 * 
	 * @mbggenerated Thu Sep 22 15:20:33 CST 2016
	 */
	int updateByPrimaryKeySelective(T record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table wd
	 * 
	 * @mbggenerated Thu Sep 22 15:20:33 CST 2016
	 */
	int updateByPrimaryKeyWithBLOBs(T record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table wd
	 * 
	 * @mbggenerated Thu Sep 22 15:20:33 CST 2016
	 */
	int updateByPrimaryKey(T record);

	public List<T> selectByCenterId(String centerId);
}
