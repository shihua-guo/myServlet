package com.briup.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.web.bean.User;

@WebFilter("/path/*")
public class IfLoginFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("判断是否登陆的filter被销毁");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		//强转获取session
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if(user==null){//如果session中没有保存user对象
			response.sendRedirect("/myServlet/login.jsp");//跳转到login页面，注意路径问题，当前目录为path
		}else{
			//继续执行之前的service
			chain.doFilter(req, resp);
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("判断是否登陆的filter被创建");
	}
	
}
