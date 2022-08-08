package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		MyUtil.draw();
		
		try {
			MyUtil.send();
		} catch (InterruptedException e) { //어떤 코드를 생성했는데 오류가 발생하면
			e.printStackTrace();			// try~catch 문으로 묶어줘라~
		}
	}
}
