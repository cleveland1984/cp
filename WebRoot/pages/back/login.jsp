<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String actionUrl = basePath + "pages/back/AdminLoginServletBack/login" ;
%>
<html>
<head>
<base href="<%=basePath%>">
<title>雇员管理 —— 管理员登录</title>
<link href="images/skin.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #1D3647;
}
-->
</style>
<jsp:include page="/pages/header_import.jsp"/>

<script type="text/javascript" src="js/login.js"></script>

<script language="JavaScript">
	function correctPNG() {
		var arVersion = navigator.appVersion.split("MSIE")
		var version = parseFloat(arVersion[1])
		if ((version >= 5.5) && (document.body.filters)) {
			for (var j = 0; j < document.images.length; j++) {
				var img = document.images[j]
				var imgName = img.src.toUpperCase()
				if (imgName.substring(imgName.length - 3, imgName.length) == "PNG") {
					var imgID = (img.id) ? "id='" + img.id + "' " : ""
					var imgClass = (img.className) ? "class='" + img.className
							+ "' " : ""
					var imgTitle = (img.title) ? "title='" + img.title + "' "
							: "title='" + img.alt + "' "
					var imgStyle = "display:inline-block;" + img.style.cssText
					if (img.align == "left")
						imgStyle = "float:left;" + imgStyle
					if (img.align == "right")
						imgStyle = "float:right;" + imgStyle
					if (img.parentElement.href)
						imgStyle = "cursor:hand;" + imgStyle
					var strNewHTML = "<span "
							+ imgID
							+ imgClass
							+ imgTitle
							+ " style=\""
							+ "width:"
							+ img.width
							+ "px; height:"
							+ img.height
							+ "px;"
							+ imgStyle
							+ ";"
							+ "filter:progid:DXImageTransform.Microsoft.AlphaImageLoader"
							+ "(src=\'" + img.src
							+ "\', sizingMethod='scale');\"></span>"
					img.outerHTML = strNewHTML
					j = j - 1
				}
			}
		}
	}
	window.attachEvent("onload", correctPNG);
</script>
</head>
<body>
	<table width="100%" height="166" border="0" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="42" valign="top"><table width="100%" height="42"
					border="0" cellpadding="0" cellspacing="0" class="login_top_bg">
					<tr>
						<td width="1%" height="21">&nbsp;</td>
						<td height="42">&nbsp;</td>
						<td width="17%">&nbsp;</td>
					</tr>
				</table></td>
		</tr>
		<tr>
			<td valign="top"><table width="100%" height="532" border="0"
					cellpadding="0" cellspacing="0" class="login_bg">
					<tr>
						<td width="49%" align="right"><table width="91%" height="532"
								border="0" cellpadding="0" cellspacing="0" class="login_bg2">
								<tr>
									<td height="138" valign="middle" align="right"><img
										src="images/logo-back.png" width="279" height="68"></td>
								</tr>

							</table></td>
						<td width="1%">&nbsp;</td>
						<td width="50%" valign="bottom"><table width="100%"
								height="59" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="4%">&nbsp;</td>
									<td width="96%" height="38"><span class="login_txt_bt">管理后台登录</span></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td height="21"><table cellSpacing="0" cellPadding="0"
											width="100%" border="0" id="table211" height="328">
											<tr>
												<td height="164" colspan="2" align="middle"> 
													<form name="myform" action="<%=actionUrl%>" method="post" onsubmit="return validate()">
														<table cellSpacing="0" cellPadding="0" width="100%"
															border="0" height="143" id="table212">
															<tr>
																<td width="13%" height="38" class="top_hui_text"><span
																	class="login_txt">管理员：&nbsp;&nbsp; </span></td>
																<td height="38" colspan="2" class="top_hui_text">
																	<input name="admin.adid" class="init" id="admin.adid" value="" size="20" onblur="validateAdid()">
																</td>
															</tr>
															<tr>
																<td width="13%" height="35" class="top_hui_text"><span
																	class="login_txt">密&nbsp;&nbsp;码： </span></td>
																<td height="35" colspan="2" class="top_hui_text">
																	<input class="init" type="password" size="20"
																	name="admin.password" id="admin.password" onblur="validatePassword()"> <img src="images/luck.gif"
																	width="19" height="18"></td>
															</tr>
															<tr>
																<td width="13%" height="35"><span class="login_txt">验证码：</span></td>
																<td height="35" colspan="2" class="top_hui_text">
																<input class="init" name="code" id="code" type="text" value=""
																	maxLength="4" size="4" onblur="validateCode()"><img src="pages/image.jsp"></td>
															</tr>
															<tr>
																<td height="35">&nbsp;</td>
																<td width="20%" height="35"><input name="Submit"
																	type="submit" class="button" id="Submit" value="登录">
																</td>
																<td width="67%" class="top_hui_text"><input
																	name="cs" type="button" class="button" id="cs"
																	value="取 消" onClick="showConfirmMsg1()"></td>
															</tr>
														</table>
														<br>
													</form></td>
											</tr>
											<tr>
												<td width="433" height="164" align="right" valign="bottom"><img
													src="images/login-wel.gif" width="242" height="138"></td>
												<td width="57" align="right" valign="bottom">&nbsp;</td>
											</tr>
										</table></td>
								</tr>
							</table></td>
					</tr>
				</table></td>
		</tr>
		<tr>
			<td height="20"><table width="100%" border="0" cellspacing="0"
					cellpadding="0" class="login-buttom-bg">
					<tr>
						<td align="center"><span class="login-buttom-txt">Copyright
								&copy; 2009-2010 Dance Shop</span></td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>
