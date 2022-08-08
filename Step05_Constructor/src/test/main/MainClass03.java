package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		// 1. MacBook 객체를 생성해서 참조값을 mac1 이라는 지역 변수에 담아 보세요
		MacBook mac1 = new MacBook(new Cpu(), new Memory(), new HardDisk());
		// 2. mac1 지역변수에 들어있는 참조값을 이용해서 
		//doGame() 메소드를 호출해서 게임을 해 보세요.
		mac1.doGame();
		
		
		Cpu a = new Cpu();
		Memory b = new Memory();
		HardDisk c = new HardDisk();
		// 생성자의 인자로 전달할 객체가 미리 어딘가 준비 되어 있다면 해당
		MacBook mac2 = new MacBook(a, b, c);
		mac2.doGame();
	}

}