package test.main;

import test.mypac.MemberDto;

public class MainClass06 {

	public static void main(String[] args) {
		// 1. MemberDto 객체를 3개 생성해서 각각의 객체에 회원의 정보를 담아보세요. (3명 정보) ㅇ
		MemberDto dto1 = new MemberDto();   //둘다 가능
		dto1.setNum(1);
		dto1.setName("김기덕");
		dto1.setAddr("남양주");
		MemberDto dto2 = new MemberDto(2, "김구라", "노량진");
		MemberDto dto3 = new MemberDto(3, "해골", "행신동");
		// 2. MemberDto 객체의 참조값 3개를 저장할 수 있는 배열 객체를 생성해서 참조값을 members 라는 지역변수에 담아보세요 ㅇ
		MemberDto[] members = new MemberDto[3]; 
		// 3. members 배열에 1. 에서 생성한 MemberDto 객체의 참조값 3개를 순서대로 담아 보세요. ㅇ
		members[0]=dto1;
		members[1]=dto2;
		members[2]=dto3;
		/* 
		 * 4. 반복문 돌면서 members 배열에 담긴 MemberDto 객체를 하나씩 참조해서 아래와 같은 형식으로
		 * 회원정보를 콘솔창에 출력해 보세요.
		 * 
		 *  번호:1, 이름:김구라, 주소:노량진
		 *  번호:2, 이름:해골 , 주소:행신동
		 *  .....
		 * */
		for(int i=0; i<members.length; i++) {
			MemberDto tmp = members[i];
			System.out.println("번호:"+tmp.getNum()+" 이름:"+tmp.getName()+" 주소:"+tmp.getAddr());
		}
	}
}
