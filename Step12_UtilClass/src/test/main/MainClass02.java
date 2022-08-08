package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * 	ArrayList 객체에
		 * 
		 * 	친구 이름 5개를 담고
		 * 
		 * 	반복문 돌면서 친구 이름을 다음과 같은 형식으로 출력해 보세요.
		 * 	
		 * 	0 번째 친구 : 김구라
		 * 	1 번쨰 친구 : 해골
		 *  ....
		 * */
		ArrayList<String> names=new ArrayList<String>();
		names.add("김구라");
		names.add("해골");
		names.add("이승훈");
		names.add("이용환");
		names.add("조동현");
		
		//friends 의 size 만큼 반복문 돌면서
		for(int i=0; i<names.size(); i++) {
			//i 번째 방에 저장된 친구 이름 참조
			String item=names.get(i);
			System.out.println(i+"번째 친구 : "+item);
		}
	}
}
