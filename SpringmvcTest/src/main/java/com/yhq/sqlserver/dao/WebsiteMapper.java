package com.yhq.sqlserver.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yhq.sqlserver.SqlServerMapper;
import com.yhq.sqlserver.pojo.WebsiteWithBLOBs;

@Repository
public interface WebsiteMapper extends SqlServerMapper<WebsiteWithBLOBs> {
	
	public List<WebsiteWithBLOBs> selectByParams(WebsiteWithBLOBs websiteWithBLOBs);
}