package com.iu.s1.list;

import java.util.List;

public class Group {
	// 1번 누르면 전체명단 출력해주는 것, 2번 누르면 주소록에 있는 정보검색해주는 것

	// 문자열을 받아서 출력하는 메서드 (판단은 메뉴에서)

	// 한사람의 정보를 출력하는 메서드
	// 정보가 있으면 출력, 없으면 정보가 없음 출력
	public void view(ListDTO listDTO) {

		if (listDTO != null) {
			System.out.println("Name : " + listDTO.getName());
			System.out.println("Lick : " + listDTO.getNick());
			System.out.println("Email : " + listDTO.getEmail());
			System.out.println("Num : " + listDTO.getPhone());
			System.out.println("Birth : " + listDTO.getBirth());
		} else {
			System.out.println("해당하는 정보가 없습니다."); // 정보검색하면 안나옴!!!
		}
	}

	public void Group(List<ListDTO> li) {

		for (int i = 0; i < li.size(); i++) {
			ListDTO listDTO = li.get(i); // 변수선언과 초기화
			System.out.println("Name : " + listDTO.getName());
			System.out.println("Lick : " + listDTO.getNick());
			System.out.println("Email : " + listDTO.getEmail());
			System.out.println("Num : " + listDTO.getPhone());
			System.out.println("Birth : " + listDTO.getBirth());
		}

	}

} // 클래스 끝
