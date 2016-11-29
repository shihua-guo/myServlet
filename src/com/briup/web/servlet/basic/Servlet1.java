package com.briup.web.servlet.basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6152310706997773974L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name  = req.getParameter("name");
		String age = req.getParameter("age");
		System.out.println(name+"--------"+age);
		//设置请求和响应的编码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		//告诉浏览器解析方式和编码
//		resp.setContentType("text/html;utf-8");
//		PrintWriter pw = resp.getWriter();
//		PrintWriter pw = new PrintWriter(resp.getOutputStream());
		OutputStream out = resp.getOutputStream();
		//读取一个文件（html）
		String fileName = "D:\\workspase\\myServlet\\src\\com\\briup\\web\\servlet\\test2.html";
		InputStream is = this.getClass().getResourceAsStream("test2.html");
		FileInputStream fis = new FileInputStream(fileName);
		byte[] b = new byte[512];
		int len = -1;
		while((len = is.read(b))!=-1){
			out.write(b,0,len);
		}
		out.flush();
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
}
