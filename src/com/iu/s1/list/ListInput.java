package com.iu.s1.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ListInput {
	// 3번 누르면 명단 추가 해주는 것 / 서비스해주는 것

	private Scanner sc;

	public void ListInput() { // 메서드 선언
		sc = new Scanner(System.in);

	}

	public ListDTO addList() {
		ListDTO listDTO = new ListDTO(); // 객체생성
		System.out.println("이름");
		System.out.println("별명");
		System.out.println("이메일");
		System.out.println("전화번호");
		System.out.println("생일");

		return listDTO; // 5시40분 다시 해보기
	}

}