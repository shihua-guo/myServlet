<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
jsp动态包含：
1.包含的页面也会编译称.java.class静态包含不会编译
2.引入的文件是在运行的时候通过一个方法引入，静态包含是在编译成,java，的时候映入文件
3.动态可以传参，静态不能传参
 -->
 <!-- 可以传参，虽然会报错 -->
 <jsp:include page="include1.jsp?name=alan">
 	<jsp:param value="3232" name="age"/>
 </jsp:include>
</body>
</html>