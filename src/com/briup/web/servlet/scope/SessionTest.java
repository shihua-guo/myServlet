package com.briup.web.servlet.scope;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ses")
public class SessionTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet 开始！！");
		HttpSession session = req.getSession();
		String id = session.getId();
//		session.setAttribute("num", 1234);
		Object o = session.getAttribute("num");
		System.out.println(o);
		System.out.println("session ID:"+id);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

}
