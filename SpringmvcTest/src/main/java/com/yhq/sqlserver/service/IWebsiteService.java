/**
 * 
 */
package com.yhq.sqlserver.service;

import java.util.List;

import com.yhq.sqlserver.pojo.WebsiteWithBLOBs;

/**
 * @author YHQ
 * @ClassName IWebsiteService
 * @Version
 * @date 2016-9-22 下午3:23:32
 */
public interface IWebsiteService {
	public List<WebsiteWithBLOBs> selectByParams(WebsiteWithBLOBs websiteWithBLOBs);
}
