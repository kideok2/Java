package frame06;

public class StringTestMain {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// 디버깅 모드로 실행해서 name1~name5 안에 들어 있는 참조값을 비교해 보세요. 
		// 각각이 다 다름.. 그래서 == 이거 써서 비교ㄴㄴ
		String name1="김기덕";
		String name2="김기덕";
		
		String name3=new String("김기덕");
		String name4=new String("김기덕");
		
		char[] arr= {'김','기','덕'};
		String name5=new String(arr);
	}
}
