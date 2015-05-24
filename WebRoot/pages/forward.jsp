<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://www.mldn.cn/c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<script type="text/javascript">
		alert("${msg}") ;
		<c:if test="${paramName == null}">
			window.location = "<%=basePath%>${path}";
		</c:if>
		<c:if test="${paramName != null}">
			window.location = "<%=basePath%>${path}?${paramName}=${paramValue}";
		</c:if>
</script>