package com.briup.web.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.briup.web.bean.Customer;
import com.briup.web.mapper.CustomerMapper;

import static  com.briup.web.command.util.MyBatisSqlSessionFactoryUtil.openSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");   
		String passwd = request.getParameter("passwd");
		String sex= request.getParameter("sex");  
		String addr= request.getParameter("addr");  
		String[] hobbies= request.getParameterValues("hobby");  
		String hobby = "";
		for(String hob:hobbies){
			hobby=hobby+","+hob;
		}
		String content= request.getParameter("content");
		Customer cus=new Customer(name, passwd, sex, addr, hobby, content);
		//读取session
		SqlSession session = openSession();
		CustomerMapper mapper = session.getMapper(CustomerMapper.class);
		mapper.insertCustomer(cus);
		session.commit();
		session.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
