package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass17 {
	public static void main(String[] args) {
		/*
		 * 	MemberDao 객체를 이용해서 회원 전체 목록을 얻어와서
		 * 	아래와 같은 형식으로 출력해 보세요.
		 * 
		 * 	번호 => 1, 이름 => 김구라, 주소 => 노량진
		 * 	번호 => 2, 이름 => 해골, 주소 => 서울
		 * 	...
		 * 	... 실행 시 바로 출력
		 * */
		//MemberDto의 목록
		List<MemberDto> members=new MemberDao().getList();
		for(MemberDto tmp:members) {
			System.out.println("번호 => "+tmp.getNum()+",이름 =>"+
				tmp.getName() + ",주소=>"+tmp.getAddr());
		}
		
		
		
	}
}
