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
 * Servlet implementation class AutoLogin
 */
@WebServlet("/autoLogin")
public class AutoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取页面的参数
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		String auto = request.getParameter("auto");
		User user = new User();
		user.setName(name);
		user.setPasswd(passwd);
		if("1".equals(auto)){//如果勾选自动登陆
			//把用户名和密码放入到cookie中
			Cookie cookie1 = new Cookie("name", name);
			Cookie cookie2 = new Cookie("passwd", passwd);
			cookie1.setMaxAge(60*60*24);
			cookie2.setMaxAge(60*60*24);
			//把cookie响应给浏览器
			response.addCookie(cookie1);
			response.addCookie(cookie2);
		}
		//把对象放入session中
		request.getSession().setAttribute("user", user);
		//跳转
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
