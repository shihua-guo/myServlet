<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 生成标签元素 -->
	<font size="100px" color="red">i am font</font><br>
	<!-- 和上面一样的效果。name就是标签元素 -->
	<jsp:element name="font">
		<jsp:attribute name="size">100px</jsp:attribute>
		<jsp:attribute name="color">red</jsp:attribute>
		<jsp:body>i am font too!!!!!!</jsp:body>
	</jsp:element>
</body>
</html>