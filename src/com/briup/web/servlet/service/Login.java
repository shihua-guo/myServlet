package com.briup.web.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.web.bean.User;

@WebServlet("/login")
public class Login extends HttpServlet{
	private User user = new User();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("进入Service~~~~~~~~");
		String name = req.getParameter("name");
		String passwd = req.getParameter("passwd");
		user.setName(name);
		user.setPasswd(passwd);
		//把对象设置到session中
		req.getSession().setAttribute("user", user);
		System.out.println(user.toString());
		//跳转到主页
		req.getRequestDispatcher("/index.html").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
