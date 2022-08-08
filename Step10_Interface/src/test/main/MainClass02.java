package test.main;

import test.mypac.Remocon;

public class MainClass02 {
	// Remocon 인터페이스를 구현한 inner class
	static class YourRemocon implements Remocon { // 인터페이스도 부모타입처럼 상속해주는 느낌(상속은 아님)
		@Override
		public void up() {
			System.out.println("볼륨 업~");
		}

		@Override
		public void down() {
			System.out.println("볼륨 다운..");
		}
	}
	
	public static void main(String[] args) {
		YourRemocon r1 = new YourRemocon();
		useRemocon(r1);
	}
	//Remocon 인터페이스 type을 인자로 전달받는 static 메소드
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
