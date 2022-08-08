package test.main;

import test.mypac.Car;
//import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {

	public static void main(String[] args) {
		//Car 객체의 참조값을 얻어내서 drive() 메소드를 여기서 호출해 보세요.
		
		MyObject MO = new MyObject(); // Car.java에 Car가 public이
		MO.getCar().drive(); // 1번답    |아니라 MyObject의 Car를 가져옴
		
		new MyObject().getCar().drive(); // 2번답 | 2번답 특징 한 번 쓰고 버림
		
		MyObject obj= new MyObject();
		Car car1=obj.getCar();
		car1.drive(); // 3번 2번을 최대한 풀어씀
	}
}