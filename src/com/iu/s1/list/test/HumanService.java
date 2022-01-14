package com.iu.s1.list.test;

import java.util.Scanner;

public class HumanService {
	
	private Scanner sc;
	
	public HumanService() {
		sc = new Scanner(System.in);
	}
	
	//이름을 입력받아서 같은 이름이 있는 HumanDTO 찾아서 리턴
	
	public HumanDTO addHuman() {
		HumanDTO humanDTO = new HumanDTO();
		System.out.println("이름 입력");
		humanDTO.setName(sc.next());
		System.out.println("별명 입력");
		humanDTO.setNick(sc.next());
		System.out.println("이메일 입력");
		humanDTO.setEmail(sc.next());
		System.out.println("전화번호 입력");
		humanDTO.setPhone(sc.next());
		System.out.println("생일 입력");
		humanDTO.setBirth(sc.next());
		return humanDTO;
	}

}