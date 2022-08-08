package test.main;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//let num1=10; - 자바 스크립트와 비교 -
		int num1=10;
		//let num2=10.1;
		double num2=10.1;
		//let isRun=true;
		boolean isRun=true;
		//let myName="김구라";
		String myName="김구라";
		// 자바스크립트 동적타입 자바 정적타입
		// 자바는 더 정확하게 정하고 사용해야된다.
		// 자바스크립트는 변수에 타입을 계속해서 바꿀 수 있다
		// num1=20; num1="true", num1="kim";
		// 이런식으로 계속 바꿀 수 있음.
		
		num1=20;
		num2=20.2;
		isRun=false;
		myName="기덕";
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}