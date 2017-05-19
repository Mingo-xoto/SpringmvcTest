/**
 * 
 */
package com.yhq.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.yhq.enumeration.DataSourcesEnum;
import com.yhq.multiDataSource.MultipleDataSource;
import com.yhq.mysql.MySqlMapper;
import com.yhq.sqlserver.SqlServerMapper;

/**
 * @author YHQ
 * @ClassName MultipleDataSourceAspectAdvice
 * @Version
 * @date 2016-9-22 上午10:49:04
 */
@Component
@Aspect
public class MultipleDataSourceAspectAdvice {

	@Around("execution(* com.yhq.*.dao.*.*(..))")
	public Object doAround(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("--aop Start--");
		if (jp.getTarget() instanceof MySqlMapper) {
			System.out.println("mysql");
			MultipleDataSource.setDataSourceKey(DataSourcesEnum.MYSQL);
		} else if (jp.getTarget() instanceof SqlServerMapper) {
			System.out.println("sqlserver");
			MultipleDataSource.setDataSourceKey(DataSourcesEnum.SQLSERVER);
		}
		System.out.println("--aop End--");
		return jp.proceed();
	}

}
