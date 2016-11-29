<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- jsp跳转，等价于服务器内部跳转 -->
<!-- 请求资源路径不会发生变化 -->
<jsp:forward page="action.jsp?score=3244324324"></jsp:forward>
<!-- 自动添加参数，和上面的一样 -->
<jsp:param value="alan" name="name"/>
<jsp:param value="898" name="age"/>
</body>
</html>