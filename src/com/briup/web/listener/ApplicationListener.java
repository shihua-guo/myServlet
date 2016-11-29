package com.briup.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		ServletContext app = arg0.getServletContext();
		System.out.println("app对象销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext app = arg0.getServletContext();
		System.out.println("app对象创建");
	}

}
