<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String str1 = "<a href='jspday1/3.jsp'>商品3</a><br>";
		//存放未点击的
		List<String> list1 = (List<String>) request.getServletContext().getAttribute("list1");
		//存放已点击的
		List<String> list2 = (List<String>) request.getServletContext().getAttribute("list2");
		//从未点击中移除对应元素
		list1.remove(str1);
		//从点击的数组中移除本身，如果有的话
		list2.remove(str1);
		//重新排序。把现有的点击数组放入临时数组中
		List<String> tmp = new ArrayList<String>();
		tmp.addAll(list2);
		list2.clear();
		//把点击的元素放入点击数组
		list2.add(str1);
		//把原有的全部添加上
		list2.addAll(tmp);
		//把改变的重新存入application
		request.getServletContext().setAttribute("list1", list1);
		request.getServletContext().setAttribute("list2", list2);
	%>
	<h1>我是商品3</h1>
</body>
</html>