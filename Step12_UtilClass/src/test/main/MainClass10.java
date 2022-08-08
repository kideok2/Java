package test.main;

import java.util.HashMap;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 회원 정보는 숫자(int), 문자(String) 으로 구성 되어 있기 때문에
		 * value 의 generic 은 Object 로 지정해야 한다.
		 * */
		
		// 여기는 써줘야됨          여기는 객체 생성 시 제너릭은 생략 가능
		HashMap<String, Object>map=new HashMap<>();
		//value의 generic 이 Object 이기 떄문에 어떤 type 이든지 담을 수 있다.
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		
		//Object type 으로 리턴되기 떄문에 원래 type으로 casting 해 주어야 한다.
		int num=(int)map.get("num");
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
	}
}
