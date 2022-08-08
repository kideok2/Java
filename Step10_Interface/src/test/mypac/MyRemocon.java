package test.mypac;

public class MyRemocon implements Remocon{
	//인터페이스는 상속?X 구현한다 implements
	//구현 메소드의 메소드를 가져온다.
	//상속은 단일상속, 인터페이스는 다중상속이 가능하다.
	@Override
	public void up() {
		System.out.println("채널을 올려요");
	}

	@Override
	public void down() {
		System.out.println("채널을 내려요");
	} 
}
