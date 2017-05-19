/**
 * 
 */
package com.yhq.sqlserver.service.Impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.sqlserver.dao.WebsiteCalMapper;
import com.yhq.sqlserver.pojo.WebsiteCalWithBLOBs;
import com.yhq.sqlserver.service.IWebsiteCalService;
import com.yhq.sqlserver.service.baseInterface.Impl.BaseInterface;

/**
 * @author YHQ
 * @ClassName WebsiteCalWithBLOBsCalService
 * @Version
 * @date 2016-9-23 下午12:49:45
 */
@Service("websiteCalService")
public class WebsiteCalService<T extends Serializable> extends BaseInterface<WebsiteCalWithBLOBs> implements IWebsiteCalService {

	@Autowired
	private WebsiteCalMapper websiteCalMapper;

	@Autowired
	WebsiteCalService(WebsiteCalMapper websiteCalMapper) {
		setServerMapper(websiteCalMapper);
	}
}
