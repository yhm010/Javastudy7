package com.iu.s1.list;

import java.util.List;
import java.util.Scanner;

public class ListInput {
	// 3번 누르면 명단 추가 해주는 것 / 서비스해주는 것

	private Scanner sc;

	public ListInput() { // 생성자
		sc = new Scanner(System.in);
	}

	// 이름을 입력 받아서 같은 이름에 있는 listDOT의 인덱스 번호 찾기
	// 찾아서 삭제
	// 리턴 -> 삭제여부 (~데이터가 왔을 때 삭제 or ~데이터는 삭제 x)
	// 0: 성공, 1:실패 A: 성공 B: 실패 true: 성공 false : 실패
	public boolean deletList(List<ListDTO> ar) {
		System.out.println("삭제할 이름을 입력하세요");
		String name = sc.next();
		
		boolean result = false;

		for(int i=0; i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				ar.remove(i);
				result = true;
				break;
			}
		}
		return result;
	}

	// 이름을 키보드로부터 입력받아서 같은 이름이 있는 정보(listDTO)를 찾아서 리턴
	public ListDTO searchList(List<ListDTO> ar) {
		System.out.println("이름을 입력하세요"); // 검색하지 않은 이름까지 다 나옴!!!
		String name = sc.next();

		ListDTO listDTO = null;

		for(int i=0; i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				listDTO=ar.get(i);
				break;
			}
		}
		return listDTO;
	}

	public ListDTO addList() {
		ListDTO listDTO = new ListDTO(); // 객체생성
		System.out.println("이름 입력");
		listDTO.setName(sc.next());
		System.out.println("별명 입력");
		listDTO.setNick(sc.next());
		System.out.println("이메일 입력");
		listDTO.setEmail(sc.next());
		System.out.println("전화번호 입력");
		listDTO.setPhone(sc.next());
		System.out.println("생일 입력");
		listDTO.setBirth(sc.next());
		return listDTO;
	}

}