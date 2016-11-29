<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function test(){
		//获取标签对象
		var msg = document.getElementById("msg");
		//获取标签对象的值
		var msgv = msg.value;
		if(msgv.trim().length!=0){
			alert(msgv);
		}
	}
</script>
</head>
<body onload="test()">
<input type="hidden" id="msg" name="msg"
	value="${requestScope.msg}"
/>
	<form action="login" method="get">
		用户名：<input type="text" name="name"/><br/>
		密码：<input type="password" name="passwd"/><br/>
		<input type="submit" value="登陆">
	</form>
</body>
</html>