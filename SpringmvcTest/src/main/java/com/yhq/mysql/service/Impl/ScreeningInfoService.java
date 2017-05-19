package com.yhq.mysql.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.mysql.dao.ScreeningInfoMapper;
import com.yhq.mysql.pojo.ScreeningInfo;
import com.yhq.mysql.service.IScreeningInfoService;
import com.yhq.mysql.service.baseInterface.Impl.BaseInterfaceService;

@Service("screeningInfoService")
public class ScreeningInfoService extends BaseInterfaceService<ScreeningInfo> implements IScreeningInfoService {

	@Autowired
	private ScreeningInfoMapper screeningInfoMapper;

	@Autowired
	public ScreeningInfoService(ScreeningInfoMapper screeningInfoMapper) {
		setMySqlMapper(screeningInfoMapper);
	}
}