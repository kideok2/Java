package test.main;


//1. 객체를 생성하는데 필요한 클래스 import
import test.mypac.Calculator;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 만일 프로그래밍의 목적이 '계산' 이라면 ?
		 * 
		 * 	- 계산기능을 수행할 수 있는 객체가 필요 하다.
		 * 	- 계산기능을 수행할 수 있는 객체를 생성해서 heap 영역에 올려놓고
		 * 	- 참조 값을 이용해서 계산을 해야한다.
		 * 
		 * */
		
		// 2. 객체를 생성한다.    new Calculator()를 담고 참조 값을 받는다.
		//					     -> 매번 꺼낼 때마다 참조 값을 각각 다르다.
		Calculator cal = new Calculator(); //클래스는 클래스명 자체가 타입이 된다.
		cal.exec();
		cal.exec();
		
		//Calculator 객체의 brand 필드 참조하기
		String a = cal.brand; //참조된 값을 변수에 대입하기
		
	}
}