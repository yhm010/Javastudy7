package com.iu.s1.list;

public class ListDTO {
	// 모델링
	private String name; // private 외부에서 집어가거나 꺼내가지 못하게! 그래서 set get 필요함
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
	private String nick;
	private String email;
	private String phone;
	private String birth;
	
	
	

}
