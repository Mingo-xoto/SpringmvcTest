package com.yhq.mysql.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.mysql.dao.GroupPeopleRelationMapper;
import com.yhq.mysql.pojo.GroupPeopleRelation;
import com.yhq.mysql.service.IGroupPeopleRelationService;
import com.yhq.mysql.service.baseInterface.Impl.BaseInterfaceService;

@Service("groupPeopleRelationService")
public class GroupPeopleRelationService extends BaseInterfaceService<GroupPeopleRelation> implements IGroupPeopleRelationService {

	@Autowired
	private GroupPeopleRelationMapper groupPeopleRelationMapper;

	@Autowired
	public GroupPeopleRelationService(GroupPeopleRelationMapper groupPeopleRelationMapper) {
		setMySqlMapper(groupPeopleRelationMapper);
	}

}