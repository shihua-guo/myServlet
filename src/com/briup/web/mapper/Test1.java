package com.briup.web.mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.web.servlet.service.Customer;

import static  com.briup.web.command.util.MyBatisSqlSessionFactoryUtil.openSession;

import java.util.List;
public class Test1 {
	@Test
	public void selectAll(){
		try {
			SqlSession session = openSession();
			CustomerMapper mapper = session.getMapper(CustomerMapper.class);
			new Customer();
			 mapper.insertCustomer(cus);;
			 
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
