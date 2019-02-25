<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<s:textfield value="%{list.get(0)}" label="自主填充"></s:textfield><br>
 <s:property value="%{list.get(0)}" /><br>
   test<br>
   ${suser.uname}<br>
   ${suser.upass}<br>
   <s:property value="#session.suser.uname" /><br>
   <s:property value="[1]" /><br>
   list集合<br>
   <s:property value="{3,4,5,6,7}.{?#this>5}" /><br>
   <s:property value="{3,4,5,6,7}.{^#this>5}" /><br>
   <s:property value="{3,4,5,6,7}.{$#this>5}" /><br>
   map集合<br>
   <s:property value="#{'a':'12','b':'23'}" /><br>
   <s:property value="#{'a':'12','b':'23'}.get('b')" /><br>
</body>
</html>