package test.mypac;

public class Car {
	// 필드 -> 여러 개 만들기 가능
	public String name="아반떼";
	// 필드 -> 동일 패키지 내에서는 import 필요없음 - Calculator.java
	//public Calculator cal = new Calculator();
	
	
	//기능 (메소드)
	public void drive() {
		System.out.println("부릉 부릉 달림~");
	}
}
