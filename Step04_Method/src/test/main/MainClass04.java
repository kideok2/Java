package test.main;

import test.mypac.Arrow;
import test.mypac.Gun;
import test.mypac.MyObject;
import test.mypac.Radio;

public class MainClass04 {

	public static void main(String[] args) {
		MyObject MO = new MyObject();
		MO.setNum(123);
		MO.setName("abc");
		
		
		// 문제1) useRadio() 메소드도 호출해 보세요.
		MO.useRadio(new Radio()); // 첫번 째 답
		
		//Radio r = new Radio(); 
		//MO.useRadio(r);		// 두번 째 답
		
		// 문제2) Radio 객체의 listenMusic() 메소드도 호출해 보세요.
		//메소드의 인자로 전달할 값이 이미 준비 되어 있을수도 있다.
		Radio r1=new Radio();		
		//이미 준비 되어 있다면 메소드 호출되면서 준비된 값을 참조해서 전달하면 된다.
		r1.listenMusic();		
		
		// 문제3) attack() 메소드를 호출해 보세요
		
		MO.attack(new Gun(), new Arrow());
		System.out.println();
	}
}