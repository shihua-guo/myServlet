package com.briup.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/login")
public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("登陆的过滤器被销毁");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("执行登陆过滤器");
		//获取用户名和密码
		String name =req.getParameter("name");
		String passwd = req.getParameter("passwd");
		//获取错误信息
		String msg=null;
		if(name.trim().length()==0){
			msg="用户名为空！请输入用户名！";
			req.setAttribute("msg", msg);
			System.out.println(msg);
			req.getRequestDispatcher("/login.jsp").forward(req, resp);;
		}else if(passwd.trim().length()==0){
			msg="密码为空！请输入密码";
			req.setAttribute("msg", msg);
			System.out.println(msg);
			req.getRequestDispatcher("/login.jsp").forward(req, resp);;
		}else{
			//继续执行之前的Service
			chain.doFilter(req, resp);
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("登陆过滤器创建");
	}

}
