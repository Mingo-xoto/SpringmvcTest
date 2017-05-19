package com.yhq.sqlserver.dao;

import org.springframework.stereotype.Repository;

import com.yhq.sqlserver.SqlServerMapper;
import com.yhq.sqlserver.pojo.WebsiteCalWithBLOBs;

@Repository
public interface WebsiteCalMapper extends SqlServerMapper<WebsiteCalWithBLOBs> {

}