/**
 * 
 */
package com.yhq.mysql;

/**
 * @author YHQ
 * @ClassName MySqlMapper
 * @Version
 * @date 2016-9-22 上午10:54:19
 */
public interface MySqlMapper<T extends Object> {
	int deleteByPrimaryKey(Long id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
}
