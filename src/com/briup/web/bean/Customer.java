package com.briup.web.bean;

public class Customer {
	private String name;
	private String passwd;
	private String sex;
	private String addr;
	private String hobby;
	private String content;
	
	public Customer(String name, String passwd, String sex, String addr, String hobby, String content) {
		super();
		this.name = name;
		this.passwd = passwd;
		this.sex = sex;
		this.addr = addr;
		this.hobby = hobby;
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", passwd=" + passwd + ", sex=" + sex + ", addr=" + addr + ", hobby=" + hobby
				+ ", content=" + content + "]";
	}
	
}