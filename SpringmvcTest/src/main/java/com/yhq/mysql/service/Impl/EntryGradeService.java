package com.yhq.mysql.service.Impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.mysql.dao.EntryGradeMapper;
import com.yhq.mysql.pojo.EntryGrade;
import com.yhq.mysql.service.IEntryGradeService;
import com.yhq.mysql.service.baseInterface.Impl.BaseInterfaceService;

/**
 * 适配器模式
 * @author YHQ
 * @ClassName EntryGradeService
 * @Version 
 * @date 2016-9-27 下午2:34:41
 */
@Service("entryGradeService")
public class EntryGradeService<T extends Serializable> extends BaseInterfaceService<EntryGrade> implements IEntryGradeService {

	@Autowired
	private EntryGradeMapper entryGradeMapper;

	@Autowired
	EntryGradeService(EntryGradeMapper entryGradeMapper) {
		setMySqlMapper(entryGradeMapper);
	}
}