package test.main;

import test.auto.Benz;
import test.auto.CampingCar;
import test.auto.Engine;

public class MainClass07 {
	public static void main(String[] args) {
		//Benz 객체를 생성해서 참조값을 car1 이라는 지역 변수에 담아 보세요
		Benz car1 = new Benz(new Engine());
		//car1 에 들어 있는 참조값을 이용해서 달리기도 하고 부드럽게 달리기도 해 보세요
		car1.drive();
		car1.smoothDrive();
		
		CampingCar CC = new CampingCar(new Engine());
		CC.drive();
		CC.sleep();
	}
}
