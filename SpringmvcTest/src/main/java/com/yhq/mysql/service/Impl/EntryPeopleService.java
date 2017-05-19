package com.yhq.mysql.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.mysql.dao.EntryPeopleMapper;
import com.yhq.mysql.pojo.EntryPeople;
import com.yhq.mysql.service.IEntryPeopleService;
import com.yhq.mysql.service.baseInterface.Impl.BaseInterfaceService;

/**
 * 适配器模式
 * @author YHQ
 * @ClassName EntryPeopleService
 * @Version 
 * @date 2016-9-27 下午2:34:55
 */
@Service("entryPeopleService")
public class EntryPeopleService extends BaseInterfaceService<EntryPeople> implements IEntryPeopleService {

	@Autowired
	private EntryPeopleMapper entryPeopleMapper;

	@Autowired
	EntryPeopleService(EntryPeopleMapper entryPeopleMapper) {
		setMySqlMapper(entryPeopleMapper);
	}
}