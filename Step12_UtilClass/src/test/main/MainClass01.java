package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		// "김구라","해골","원숭이" 3개의 String type 을 저장해 보세요.
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		//0번방의 아이템을 불러와서 item 이라는 변수에 담아보세요
		String item=names.get(0);
		names.remove(1);
		//0 번방에 "에이콘"을 넣고 싶으면?
		names.set(0, "에이콘");
		// 저장된 아이템의 갯수(size) 를 size라는 지역 변수에 담아 보세요.
		int size=names.size();
		// 저장된 모든 아이템 전체 삭제
		names.clear();	
	}
}
