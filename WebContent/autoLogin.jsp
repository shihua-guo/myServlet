<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="autoLogin" method="get">
	用户名：<input type="text" name="name" />
	密码：<input type="text" name="passwd" />
	是否自动登陆：<input type="checkbox" value="1" name="auto"/>
	<input type="submit" value="登陆"/>
</form>
</body>
</html>