package com.iu.s1.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMenu {
	// 주소록에서 어떤 것을 할지 입력받는 것

	public void phoneNember() { // 메서드 선언한 것임.
		Scanner sc = new Scanner(System.in); // 위에 메서드 선언 하고 써야 함.

		ListInput li = new ListInput(); //객체생성
		Group go = new Group();
		ArrayList<ListDTO> ar = new ArrayList<>();

		boolean check = true; // While 쓰려면 미리 해놔야함.
		while (check) {

			System.out.println("1. 전체명단 출력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 주소록 명단 추가");
			System.out.println("4. 주소록 명단 삭제");
			System.out.println("5. 종료");
			int select = sc.nextInt();

			if (select == 1) { // 위에 변수 선언과 이름 같아야함.
				go.Group(ar);
			} else if (select == 2) {
				ListDTO listDTO = li.searchList(ar);
				go.Group(ar);
			} else if (select == 3) {
				ListDTO listDTO = li.addList();
				ar.add(listDTO);
			} else if (select == 4) {
				boolean flag = li.deletList(ar);
				if(flag) {
					System.out.println("성공");
				}else {
					System.out.println("실패");
				}
			} else {
				System.out.println("finish!!");
				break;
			}
		}
	}
}
