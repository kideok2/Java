package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject 클래스에 정의된 3개의 메소드를 차례로 호출하는 code를 작성해 보세요.
		MyObject mo = new MyObject();
		// return type 이 없는 메소드 호출
		mo.walk();
		// return type 이 int 인 메소드 호출
		int a = mo.getNumber();
		// return type 이 String 인 메소드 호출
		String b = mo.getGreeting();
		
		System.out.println(a + b);
	}
}