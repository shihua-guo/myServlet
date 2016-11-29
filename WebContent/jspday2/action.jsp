<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.briup.web.bean.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 使用jsp置零生成java对象 
	ID 对象的别名
-->
<jsp:useBean id="user" class="com.briup.web.bean.User" scope="page">
</jsp:useBean>
<!-- 和上面的等价：都是set入一个user -->
<%
	User us = null;
	us = (User)pageContext.getAttribute("us");
	if(us==null){
		us = new User();
		pageContext.setAttribute("us", us);
	}
%>
<%=pageContext.getAttribute("us").hashCode() %>
<%=pageContext.getAttribute("user").hashCode() %>

<!-- 设置属性 -->
<jsp:setProperty property="name" name="user" value="alan"/>
<jsp:setProperty property="passwd" name="user" value="789"/>
<%us = (User)pageContext.getAttribute("us");
us.setName("jade");
us.setPasswd("1223");/* 
pageContext.setAttribute("us", us); */
%>
<%=pageContext.getAttribute("us") %>
<%=pageContext.getAttribute("user") %>

<!-- 取地址栏发送的参数 -->
参数score：=======${param.score}
<%-- 这个是高级注解：在浏览器查看源码无法看到--%>

参数name：=======${param.name}
参数age：=======${param.age}





</body>
</html>