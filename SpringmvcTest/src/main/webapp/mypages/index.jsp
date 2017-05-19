<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	Springmvc控制跳转默认页面ww
	<br>
	<input type="button" value="json" id="first" />
	<a href="test/firstJsp">跳去第一个页面</a>
	<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#first").click(function() {
				// 				$.get("test/getJson.json",
				// 					function(data, status) {
				// 						console.log(status);
				// 						console.log(data);
				// 					}
				// 				);
				$.ajax({
					url : "test/getJson.json",
					dataType : "json",
					success : function(data) {
						console.log(data);
					},
					complete : function(data) {
						console.log("请求完成...");
					}
				});
			});
		});
		// 		var pc = new webkitRTCPeerConnection(this.fuck, {
		// 			optional : [ {
		// 				RtpDataChannels : true
		// 			} ]
		// 		});
		// 		pc.onicecandidate = function(ice) {
		//			//skip non-candidate events
		// 			if (ice.candidate) {
		// 				console.log(ice.candidate.candidate);
		// 			}

		// 		};
		// 		pc.createDataChannel("");
		// 		pc.createOffer(function(result) {
		// 			pc.setLocalDescription(result, function() {
		// 			}, function() {
		// 			});
		// 		}, function() {
		// 		});
	</script>
</body>
</html>
