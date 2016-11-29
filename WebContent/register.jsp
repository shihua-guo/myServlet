<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Register" method="post">
		用户名：<input type="text" name="name"/><br/>
		密码：<input type="password" name="passwd" /><br/>
		性别：<input type="radio" name="sex" checked="checked" value="男"/>男
			<input type="radio" name="sex"  value="女"/>女
		<br/>
		地址：<select name="addr">
			<option value="昆山">昆山</option>
			<option value="上海">上海</option>
			<option value="苏州">苏州</option>
			<option value="南京">南京</option>
		</select><br/>
		爱好：
		<input type="checkbox" name="hobby" value="篮球"/>篮球<br/>
		<input type="checkbox" name="hobby" value="羽毛球"/>羽毛球<br/>
		<input type="checkbox" name="hobby" value="足球"/>足球<br/>
		备注：
		<textarea rows="8" cols="8" name="content"></textarea>
		<input type="submit" value="注册">
	</form>
</body>
</html>