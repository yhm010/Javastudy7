package com.iu.s1.list;

import java.util.ArrayList;

public class Group {
	// 1번 누르면 전체명단 출력해주는 것
	
	// List, Set, Map : 데이터들의 집합 여러개의 데이터 모을 때 사용
	// 나는 ArrayList 사용 why? 나머지는 순서유지가 안되고, 중복허용이 안됨.
	// ListDTO에 있는 정보를 가져와야 함. 가져올때 get 사용
	// get은 int로만 받음. -> string으로 형변환

	public void Everything() { // void를 ArrayList(String)로 변경

		ArrayList<String> list = new ArrayList<>(); // 객체 생성 (전체명단)
		list.add("문자"); // ListDTO의 정보 가져오기
		
		System.out.println("전체명단을 출력합니다.");
		System.out.println(list); // 위에 있는 [문자] 출력 됨.
		System.out.println(list.get(0)); // 문자 출력
		System.out.println();
		
	} // 메서드 끝
	
	public ListDTO Group() {
		ListDTO ld= new ListDTO();
		System.out.println(ListDTO.class);
		return ld;
		
	}
//	return names; // 8번 리턴타입 확인
} // 클래스 끝
