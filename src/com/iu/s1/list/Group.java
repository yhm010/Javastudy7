package com.iu.s1.list;

import java.util.ArrayList;
import java.util.List;

public class Group {
	// 1번 누르면 전체명단 출력해주는 것

	public void Group(List<ListDTO> li) { 
		
		for (int i=0;i<li.size();i++) {
			ListDTO listDTO = li.get(i); // 변수선언과 초기화
			System.out.println("Name :" + listDTO.getName());
			System.out.println("Lick :" + listDTO.getNick());
			System.out.println("Email : " +listDTO.getEmail());
			System.out.println("Num : " + listDTO.getPhone());
			System.out.println("Birth :" + listDTO.getBirth());
		}


		
	}

} // 클래스 끝
