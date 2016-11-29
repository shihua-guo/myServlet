package com.briup.web.servlet.forward;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 内部跳转到其他页面
 * @author alan
 * @date Oct 24, 2016 2:45:27 PM
 */
public class Servlet1 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6152310706997773974L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取name参数
		String name = req.getParameter("name");
		System.out.println(name);
		String page=null;
		//需要跳转哪个页面
		if("A".equals(name)){
			page="/A.html";
		}else{
			page="/B.html";
		}
		//获取对应页面的请求分发器。
		RequestDispatcher dispatcher = req.getRequestDispatcher(page);
		//把请求和响应都发送到页面
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}

}
