package com.yhq.mysql.service.Impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.mysql.dao.GroupInfoMapper;
import com.yhq.mysql.pojo.GroupInfo;
import com.yhq.mysql.service.IGroupInfoService;
import com.yhq.mysql.service.baseInterface.Impl.BaseInterfaceService;

@Service("groupInfoService")
public class GroupInfoService<T extends Serializable> extends BaseInterfaceService<GroupInfo> implements IGroupInfoService {

	@Autowired
	private GroupInfoMapper groupInfoMapper;

	@Autowired
	public GroupInfoService(GroupInfoMapper groupInfoMapper) {
		setMySqlMapper(groupInfoMapper);
	}
}