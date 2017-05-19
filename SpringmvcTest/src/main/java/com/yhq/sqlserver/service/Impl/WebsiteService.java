/**
 * 
 */
package com.yhq.sqlserver.service.Impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.sqlserver.dao.WebsiteMapper;
import com.yhq.sqlserver.pojo.WebsiteCalWithBLOBs;
import com.yhq.sqlserver.pojo.WebsiteWithBLOBs;
import com.yhq.sqlserver.service.IWebsiteService;
import com.yhq.sqlserver.service.baseInterface.Impl.BaseInterface;

/**
 * @author YHQ
 * @ClassName WebsiteService
 * @Version
 * @date 2016-9-22 下午3:23:44
 */
@Service("websiteService")
public class WebsiteService<T extends Serializable> extends BaseInterface<WebsiteWithBLOBs> implements IWebsiteService {

	@Autowired
	private WebsiteMapper websiteMapper;

	@Autowired
	WebsiteService(WebsiteMapper websiteMapper) {
		setServerMapper(websiteMapper);
	}

	public List<WebsiteWithBLOBs> selectByParams(WebsiteWithBLOBs websiteWithBLOBs) {
		return websiteMapper.selectByParams(websiteWithBLOBs);
	}

}
