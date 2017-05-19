package com.yhq.controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.encoder.QRCode;
import com.yhq.mysql.pojo.GroupInfo;
import com.yhq.mysql.service.Impl.EntryGradeService;
import com.yhq.mysql.service.Impl.EntryPeopleService;
import com.yhq.mysql.service.Impl.GroupInfoService;
import com.yhq.mysql.service.Impl.GroupPeopleRelationService;
import com.yhq.mysql.service.Impl.ScreeningInfoService;
import com.yhq.mysql.service.Impl.UserService;
import com.yhq.sqlserver.service.Impl.WebsiteCalService;
import com.yhq.sqlserver.service.Impl.WebsiteService;

@Controller
public class IndexController {

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

	@RequestMapping("/")
	public String index() {
		System.out.println("index...");
		return "index";
	}

	@RequestMapping(value = "firstJsp")
	public String toFirstJsp() {
		log.info("++log测试...");
		System.out.println(log);
		infoLogger.info("++测试...");
		infoLogger.info("--测试...");

		return "firstJsp";
	}
	
	@RequestMapping(value = "encoderQRCoder")
	public BufferedImage encoderQRCoder(HttpServletResponse response) {
		try {
			String content = "http://bank.frontpay.cn:8030/agencyreceiptrate/add?paychannelid=312232155382538240";

			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();

			Map<EncodeHintType, String> hints = new HashMap<EncodeHintType, String>();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 400, 400, hints);
			ImageIO.write(MatrixToImageWriter.toBufferedImage(bitMatrix), "jpg", response.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
