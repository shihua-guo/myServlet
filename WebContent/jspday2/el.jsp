<%@page import="com.briup.web.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	User user = new User();
	user.setName("alan");
	user.setPasswd("fdsfds");
	request.setAttribute("user", user);
	session.setAttribute("user", user);
	application.setAttribute("user", user);
	
	/* 如果key有空格：由多个单词组成 */
	User user2 = new User();
	user2.setName("jade");
	user2.setPasswd("fdsfdsewre");
	request.setAttribute("user 2", user2);
%>
<h1>我是request：${requestScope.user}
	
</h1>
<h1>我是session：${sessionScope.user}
	
</h1>
<h1>我是application：${applicationScope.user}
	
</h1>
<!-- 如果key有空格：由多个单词组成 -->
<h1>我是request222：${requestScope["user 2"]}
</h1>
	<h1>测试empty:${empty "" }====是否为空</h1>
	<h2>测试三木</h2>
	${param.score>90?"及格":"不及格" }
</body>
</html>