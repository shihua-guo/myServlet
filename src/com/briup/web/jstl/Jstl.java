package com.briup.web.jstl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.web.bean.User;

/**
 * Servlet implementation class Jstl
 */
@WebServlet("/jstl")
public class Jstl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jstl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user1 =new User("alan","jcfdkls");
		User user2 =new User("alan111","jcfdkls");
		User user3 =new User("alan222","jcfdkls");
		User user4 =new User("alan333","jcfdkls");
		User[] userArr = {user1,user2,user3,user4};
		request.setAttribute("userArr", userArr);
		request.getRequestDispatcher("/jspday2/jstl.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
