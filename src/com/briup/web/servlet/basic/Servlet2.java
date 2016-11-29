package com.briup.web.servlet.basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 跳转到注册页面
 * 
 * @author alan
 * @date Oct 23, 2016 12:10:59 PM
 */
public class Servlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6152310706997773974L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		System.out.println(name + "--------" + age);
		// 设置请求和响应的编码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		OutputStream out = resp.getOutputStream();
		// 读取一个文件（html）
		String fileName = "D:\\workspase\\myServlet\\WebContent\\register.html";
		FileInputStream fis = new FileInputStream(fileName);
		byte[] b = new byte[512];
		int len = -1;
		while ((len = fis.read(b)) != -1) {
			out.write(b, 0, len);
		}
		out.flush();
		out.close();
		
		
		HttpSession session = req.getSession();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
