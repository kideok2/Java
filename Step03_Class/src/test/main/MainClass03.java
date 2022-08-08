package test.main;

import test.mypac.Member;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//Member 객체를 생성해서 그 참조값을 mem1 이라는 지역변수에 담아 보세요. (1줄)
		Member mem1 = new Member();		
		mem1.no=1;
		mem1.name="김기덕";
		mem1.address="남양주시";
		//mem1.isMan=true; 설계된 대로 사용되어서 isMan은 사용할 수 없다.
		
		//Member 객체를 생성해서 그 참조값을 mem2 이라는 지역변수에 담고 해골의 정보도 담아 보세요.
		Member mem2 = new Member();
		mem2.no=2;
		mem2.name="해골";
		mem2.address="행신동";

		//mem1, mem2에 들어있는 참조값을 이용해서 showInfo() 메소드 호출하기
		mem1.showInfo();
		mem2.showInfo();
	}
}
