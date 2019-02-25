<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<base href="<%=basePath%>">

<title>MyStruts2</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>

<body>
	<h1>用户登陆</h1>
	<form action="userloginAction" method="post">
	<s:textfield value="" label="自主填充" name="list[0]"></s:textfield><br>
		用户名:<input type="text" value="" name="uname"> <br> 密码:<input
			type="password" value="" name="upass"> <br>
		<input type="submit" value="登陆" name="btnLogin">
	</form>
</body>
</html>
