package test.main;

import java.util.Random;

public class MainClass07 {

	public static void main(String[] args) {
		// Random type 참조값이 담길 수 있는 ran 이라는 이름의 	빈 지역변수 만들기
		Random ran = null;                //9,11 한줄로 가능 Random ran = new Random();
		// Random 객체를 생성해서 그 참조값을 지역변수 ran 에 대입하기
		ran=new Random();
		// 참조값에 . 찍어서 nextInt() 메소드를 호출하고 메소드나 리턴해주는 값을 지역변수 ranNum 에 담기
		int ranNum=ran.nextInt(); 
		// ranNum 변수에 담긴 값을 콘솔창에 출력해보기.
		System.out.println(ranNum);
	}
}