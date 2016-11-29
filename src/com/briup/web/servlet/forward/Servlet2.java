package com.briup.web.servlet.forward;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 内部跳转到其他servlet。
 * @author alan
 * @date Oct 24, 2016 2:54:36 PM
 */
public class Servlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6152310706997773974L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取参数
		String name = req.getParameter("name");
		//判断跳转到哪个servlet
		String servlet = null;
		if("A".equals(name)){
			servlet = "/A";
		}else{
			servlet = "/B";
		}
		//跳转到servlet
		RequestDispatcher dispatcher = req.getRequestDispatcher(servlet);
		dispatcher.forward(req, resp);
//		doGet(req, resp);
	}

}
