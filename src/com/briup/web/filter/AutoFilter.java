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

import com.briup.web.bean.User;

/**
 * Servlet Filter implementation class AutoFilter
 */
@WebFilter("/autoLogin.jsp")
public class AutoFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AutoFilter() {
    	
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("自动登陆过滤器被销毁");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		Cookie[] cookies = req.getCookies();
		if(cookies!=null){//如果是有cookie就进行判断
			//存放cookie的map
			Map<String,String> map = new HashMap<String,String>();
			for(Cookie cookie:cookies){//遍历cookie
				String key = cookie.getName();
				String value = cookie.getValue();
				map.put(key, value);
			}
			if(map.containsKey("name") && map.containsKey("passwd")){//判断是否包含name和passwd
				//放入对象中
				User user = new User();
				user.setName(map.get("name"));
				user.setPasswd(map.get("passwd"));
				//把对象放入session中
				req.getSession().setAttribute("user", user);
				//内部跳转
				req.getRequestDispatcher("/index.html").forward(request, response);
			}
			else{
				chain.doFilter(request, response);
			}
		}else{//如果没有cookie就继续执行之前的servlet
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("自动登陆过滤器被创建");
	}

}
