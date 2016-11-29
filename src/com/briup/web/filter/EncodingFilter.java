package com.briup.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class EncodingFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("filter销毁");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		arg0.setCharacterEncoding("UTF-8");
		arg1.setCharacterEncoding("UTF-8");
		System.out.println("准备执行Encoding Filter");
		arg2.doFilter(arg0, arg1);
		System.out.println("执行完毕Encoding Filter");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter创建");
	}

}
