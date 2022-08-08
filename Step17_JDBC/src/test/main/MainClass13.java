package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		int num=1;
		String name="햄버거";
		String addr="맥도날드";
		/*
		 * 	위의 회원 정보를 MemberDao 객체를 이용해서 DB에 저장하고 
		 * 	성공이면 "회원정보를 추가 했습니다.
		 * 	실패면 "추가 실패"
		 *  를 콘솔창에 출력하는 code를 작성해 보세요.
		 * */
		
		// 추가할 회원의 정보를 MemberDto 객체를 생성해서 담는다.
		MemberDto dto=new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		
		//MemberDao 객체를 생성해서
		MemberDao dao = new MemberDao();
		//insert() 메소드를 이용해서 회원의 정보를 추가하고 성공 여부를 리턴 받는다.
		boolean isSuccess=dao.insert(dto);
		
		if(isSuccess) {
			System.out.println("회원 정보를 추가 했습니다.");
		} else {
			System.out.println("추가 실패!");
		}
	}
}
