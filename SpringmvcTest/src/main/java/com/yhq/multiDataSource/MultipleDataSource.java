/**
 * 
 */
package com.yhq.multiDataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.yhq.enumeration.DataSourcesEnum;

/**
 * @author YHQ
 * @ClassName MultipleDataSource
 * @Version
 * @date 2016-9-22 上午10:44:07
 */
public class MultipleDataSource extends AbstractRoutingDataSource {
	private static final ThreadLocal<DataSourcesEnum> dataSourceKey = new InheritableThreadLocal<DataSourcesEnum>();

	public static void setDataSourceKey(DataSourcesEnum dataSource) {
		dataSourceKey.set(dataSource);
	}

	@Override
	protected Object determineCurrentLookupKey() {
		return dataSourceKey.get();
	}

}
