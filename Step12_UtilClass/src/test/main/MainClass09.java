package test.main;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass09 {
	public static void main(String[] args) { //<key, value>형태
									   //<String, Object>생성할 때 생략가능	
		HashMap<String, String> dic=new HashMap<>();
		dic.put("house", "집");     //put 샘플 데이터 저장
		dic.put("phone", "핸드폰");
		dic.put("car", "차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		/*
		 * 검색할 단어를 입력하세요:house
		 * house 의 뜻은 집입니다.
		 * 
		 * 검색할 단어를 입력하세요:gura
		 * gura 는 목록에 없습니다.
		*/
		Scanner scan=new Scanner(System.in); //키보드에서 입력 받을 수 있는 값
		System.out.print("검색할 단어를 입력하세요: ");
		String name=scan.nextLine();
		String mean=dic.get(name);
		if(mean == null) {
			System.out.println(name+"는 목록에 없습니다");
		}else {
			System.out.println(name+"의 뜻은 "+mean+" 입니다");
		}
		
		//만일 HashMap 객체가 입력한 word 를 key 값으로 가지고 있다면
		//if(dic.containsKey(name)) {
		//	System.out.println(name+"의 뜻은 "+mean+" 입니다");
		//} else {
		//	System.out.println(name+"는 목록에 없습니다");
		//}
	}
}
