package com.yhq.controller;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yhq.mysql.service.Impl.EntryGradeService;
import com.yhq.mysql.service.Impl.EntryPeopleService;
import com.yhq.mysql.service.Impl.GroupInfoService;
import com.yhq.mysql.service.Impl.GroupPeopleRelationService;
import com.yhq.mysql.service.Impl.ScreeningInfoService;
import com.yhq.mysql.service.Impl.UserService;
import com.yhq.sqlserver.pojo.WebsiteCalWithBLOBs;
import com.yhq.sqlserver.pojo.WebsiteWithBLOBs;
import com.yhq.sqlserver.service.Impl.WebsiteCalService;
import com.yhq.sqlserver.service.Impl.WebsiteService;

@RestController
@RequestMapping(value = "/test/")
public class TestController {

	private Logger log = LogManager.getLogger(TestController.class);
	private Logger infoLogger = LogManager.getLogger("infoLogger");

	@Autowired
	private WebsiteService websiteService;

	@Autowired
	private WebsiteCalService websiteCalService;

	@Autowired
	private UserService userService;

	@Autowired
	private GroupPeopleRelationService groupPeopleRelationService;

	@Autowired
	private GroupInfoService groupInfoService;
	@Autowired
	private EntryGradeService entryGradeService;
	@Autowired
	private EntryPeopleService entryPeopleService;
	@Autowired
	private ScreeningInfoService screeningInfoService;

	@RequestMapping(value = "firstJsp")
	public String toFirstJsp() {
		log.info("++log测试...");
		System.out.println(log);
		infoLogger.info("++测试...");
		infoLogger.info("--测试...");
		System.out.println(infoLogger.getName());
//		GroupInfo groupInfo = (GroupInfo) groupInfoService.selectByPrimaryKey(49L);
//		EntryGrade entryGrade = (EntryGrade) entryGradeService.selectByPrimaryKey(22L);
		WebsiteWithBLOBs websiteWithBLOBs = new WebsiteWithBLOBs();
		websiteWithBLOBs.setCenterid("01");
		websiteWithBLOBs.setTitle("01003");
		List<WebsiteCalWithBLOBs> list = websiteService.selectByParams(websiteWithBLOBs);
		// System.out.println(groupInfo);
		System.out.println(JSONArray.fromObject(list));
		return "firstJsp";
	}

	// @ResponseBody
	@RequestMapping(value = "selectWd")
	public ModelMap selectWd() {
		ModelMap map = new ModelMap();
		// System.out.println("--线程池多线程分批读取--");
		// websiteService.multiThreadRead(map);
		// infoLogger.info(map);
		// System.out.println("--单线程分批读取--");
		// websiteService.singleThreadRead(map);
		// infoLogger.info(map);
		System.out.println("--一次性读取--");
		websiteService.ReadAll(map);
		infoLogger.info(map);
		return map;
	}

	// @ResponseBody
	@RequestMapping(value = "selectWdCal")
	public ModelMap selectWdCal() {
		ModelMap map = new ModelMap();
		// System.out.println("--线程池多线程分批读取--");
		// websiteCalService.multiThreadRead(map);
		// infoLogger.info(map);
		// System.out.println("--单线程分批读取--");
		// websiteCalService.singleThreadRead(map);
		// infoLogger.info(map);
		System.out.println("--一次性读取--");
		websiteCalService.ReadAll(map);
		// infoLogger.info(map);
		return map;
	}
}
