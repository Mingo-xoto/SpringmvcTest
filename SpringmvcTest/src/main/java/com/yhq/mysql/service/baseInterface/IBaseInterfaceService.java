/**
 * 
 */
package com.yhq.mysql.service.baseInterface;

/**
 * @author YHQ
 * @ClassName BaseInterface
 * @Version
 * @date 2016-9-27 下午1:38:01
 */
public interface IBaseInterfaceService<T extends Object> {
	int deleteByPrimaryKey(Long id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
}
