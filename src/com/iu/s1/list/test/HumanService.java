package com.iu.s1.list.test;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class HumanService {
	
	private Scanner sc;
	
	public HumanService() {
		sc = new Scanner(System.in);
	}
	
	//이름을 입력 받아서 같은 이름이 있는 HumanDTO의 인덱스 번호 찾기
	//찾아서 삭제
	//리턴 삭제여부  0:성공, 1:실패  S:성공, F:실패  true:성공,false:실패
	public boolean deleteHuman(List<HumanDTO> ar) {
		System.out.println("삭제할 이름 입력");
		String name = sc.next();
		
		boolean result=false;
		HumanDTO humanDTO = null;
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName() ) ) {
				humanDTO= ar.get(i);
				//result = ar.remove(ar.get(i));
				//humanDTO = ar.remove(i);
				//result=true;
				break;
			}
		}
		
		return ar.remove(humanDTO); //result;
		
	}
	
	//이름을 입력받아서 같은 이름이 있는 HumanDTO 찾아서 리턴
	public HumanDTO searchHuman(List<HumanDTO> ar) {
		System.out.println("이름을 입력");
		String name = sc.next();
		
		HumanDTO humanDTO=null;
		
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				humanDTO = ar.get(i);
				break;
			}
		}
		
		return humanDTO;
		
	}
	
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
		String s = sc.next();//20001224
		int year = Integer.parseInt(s.substring(0,4));
		int month = Integer.parseInt(s.substring(4, 6));
		int date = Integer.parseInt(s.substring(6));
		
		//Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, date);
		
		humanDTO.setBirth(calendar);
		
		return humanDTO;
	}

}