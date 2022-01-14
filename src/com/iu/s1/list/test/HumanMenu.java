package com.iu.s1.list.test;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanMenu {
	
	
	
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언들..]) {
	public void select() {
		Scanner sc = new Scanner(System.in);
		HumanService hs = new HumanService();
		HumanView hv = new HumanView();
		ArrayList<HumanDTO> ar = new ArrayList<>();
		boolean check=true;
		while(check) {
			System.out.println("1. 전체 출력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 명단 추가");
			System.out.println("4. 명단 삭제");
			System.out.println("5. 종    료");
			int select = sc.nextInt();
			
			if(select==1) {
				hv.view(ar);
			}else if(select==2) {

				HumanDTO humanDTO = hs.searchHuman(ar);
				hv.view(ar);
				
			}else if(select==3) {
				
				HumanDTO humanDTO = hs.addHuman();
				ar.add(humanDTO);
				
			}else if(select==4) {
				System.out.println("44444");
			}else {
				System.out.println("Finish");
				break;
			}
		}
	}

}