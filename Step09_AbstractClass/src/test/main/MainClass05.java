package test.main;

import test.mypac.Weapon;

public class MainClass05 {// 추상 클래스 사용하는 최상 버전
	public static void main(String[] args) { 
		Weapon w1=new Weapon() {
			@Override
			public void attack() {
				System.out.println("몰라 몰라 아무나 공격하자.");
			}
		};
		useWeapon(w1);
		
		// 지역변수 만들지 않고 바로 익명클래스로 객체 생성 후 참조값 전달하기
		MainClass05.useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("공중 공격을 해요!!!");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
