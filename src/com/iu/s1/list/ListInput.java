package com.iu.s1.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ListInput {

	private Scanner sc;
	public void ListInput () { // 클래스명과 같아야함. 
		sc = new Scanner(System.in);
		
	}
	public ListDTO phoneInput() {
		ListDTO li = new ListDTO();
		System.out.println("이름");
		System.out.println("별명");
		System.out.println("이메일");
		System.out.println("전화번호");
		System.out.println("생일");
		
		return li; // 5시40분 다시 해보기
	}
	
}
