<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//存放未点击的
		List<String> list1 = (List<String>) request.getServletContext().getAttribute("list1");
		//存放已点击的
		List<String> list2 = (List<String>) request.getServletContext().getAttribute("list2");
		if (list1 == null) {
			//初始化数组
			List<String> intList = new ArrayList<String>();
			intList.add("<a href='jspday1/1.jsp'>商品1</a><br>");
			intList.add("<a href='jspday1/2.jsp'>商品2</a><br>");
			intList.add("<a href='jspday1/3.jsp'>商品3</a><br>");
			intList.add("<a href='jspday1/4.jsp'>商品4</a><br>");
			intList.add("<a href='jspday1/5.jsp'>商品5</a><br>");
			request.getServletContext().setAttribute("list1", intList);
			//把未点击的初始化
			list2 = new ArrayList<String>();
			request.getServletContext().setAttribute("list2", list2);
		}
		//遍历已点击的
		for (String str : list2) {
			out.write(str);
		}
		//遍历未点击
		for (String str : list1) {
			out.write(str);
		}
	%>



</body>
</html>