package com.briup.web.servlet.scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 测试session的生命周期：每次set进去，下次再读取
 * @author alan
 * @date Oct 24, 2016 6:45:41 PM
 */
public class SessionNum extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setMaxInactiveInterval(60);
		Integer num = (Integer) session.getAttribute("num");
		if(num==null){
			num=1;
			session.setAttribute("num",num);
		}
		PrintWriter writer = resp.getWriter();
		writer.write("<h1>"+num+"</h1>");
		writer.flush();
		session.setAttribute("num",++num);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
}
