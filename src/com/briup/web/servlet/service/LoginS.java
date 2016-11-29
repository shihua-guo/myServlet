package com.briup.web.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.web.bean.User;

/**
 * Servlet implementation class LoginS
 */
@WebServlet("/LoginS")
public class LoginS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginS() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		//从DB获取记录....省省略?????
		//获取DB中的对象
		User user = new User();
		user.setName(name);
		user.setPasswd(passwd);
		//写cookie
		Cookie cookie1 = new Cookie("name", name);
		Cookie cookie2 = new Cookie("passwd", passwd);
		//response
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		//把标识（是否自动登陆）写回去????
		//把user对象写入session
		request.getSession().setAttribute("user", user);
		//内部跳转
		request.getRequestDispatcher("/index.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
