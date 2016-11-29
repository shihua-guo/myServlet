package com.briup.web.servlet.scope;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app")
public class ApplicationTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取app
		System.out.println("我在获取Application对象");
//		ServletContext app = this.getServletContext();
		ServletContext app = req.getServletContext();
//		ServletContext app = req.getSession().getServletContext();
		app.setAttribute("num", 1000);
		Integer num =  (Integer) app.getAttribute("num");
		System.out.println(num);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
}
