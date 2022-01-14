package com.iu.s1.list;

import java.util.Scanner;

public class ListMenu {
	// 주소록에서 어떤 것을 할지 입력받는 것

	public void phoneNember() { // 메서드 선언한 것임.
		Scanner sc = new Scanner(System.in); // 위에 메서드 선언 하고 써야 함.

		ListInput li = new ListInput(); //객체생성
		Group go = new Group();

		boolean check = true; // While 쓰려면 미리 해놔야함.
		while (check) {

			System.out.println("1. 전체명단 출력");
			System.out.println("2. 이름 입력하면 그 사람의 정보가 출력");
			System.out.println("3. 주소록 명단 추가");
			System.out.println("4. 주소록 명단 제거");
			System.out.println("5. 종료");

			int select = sc.nextInt();

			if (select == 1) { // 위에 변수 선언과 이름 같아야함.
				go.Everything(go);
			} else if (select == 2) {
				System.out.println("2번 선택");
			} else if (select == 3) {
				ListDTO listDTO = 
				li.phoneInput();
			} else if (select == 4) {
				System.out.println("4번 선택");
			} else {
				System.out.println("finish!!");
				break;
			}
		}
	}
}
