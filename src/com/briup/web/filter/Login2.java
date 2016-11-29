package com.briup.web.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Login2
 */
@WebFilter("/Login3.jsp")
public class Login2 implements Filter {

    /**
     * Default constructor. 
     */
    public Login2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("login2销毁");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		//get cookie
		Cookie[] cookies = req.getCookies();
		if(cookies!=null){
			Map<String,String> map = new HashMap<>();
			for(Cookie cookie:cookies){
				String key = cookie.getName();
				String value = cookie.getValue();
				map.put(key, value);
			}
			if(map.containsKey("name") && map.containsKey("passwd")){
				//把值放入request中
				request.setAttribute("name", map.get("name"));
				request.setAttribute("passwd", map.get("passwd"));
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}else{
				chain.doFilter(request, response);
			}
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("login创建");
	}

}
