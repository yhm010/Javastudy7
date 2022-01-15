package com.iu.s1.list;

import java.util.Calendar;

public class ListDTO {
	// 모델링 데이터를 넣어주는 것
	 // private 외부에서 집어가거나 꺼내가지 못하게! 그래서 set get 필요함
	
	private String name;
	private String nick;
	private String email;
	private String phone;
	private String birth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	

}
