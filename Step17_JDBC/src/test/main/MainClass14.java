package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		/*
		 * 	위의 회원 정보를 MemberDao 객체를 이용해서 DB에 수정하고 
		 * 	성공이면 "회원정보를 수정 했습니다.
		 * 	실패면 "수정 실패"
		 *  를 콘솔창에 출력하는 code를 작성해 보세요.
		 * */
		int num = 26;
		String name = "커피";
		String addr = "스타벅스";
		
		//수정할 회원의 정보를 MemberDto 객체에 담고 
		MemberDto dto = new MemberDto(num, name, addr);
		//dto.setNum(num);
		//dto.setName(name);
		//dto.setAddr(addr);
		
		//MemberDao 객체를 이용해서 수정한다.
		MemberDao dao = new MemberDao();
		
		boolean isSuccess = dao.update(dto);
		
		if(isSuccess) {
			System.out.println("회원 정보를 수정 했습니다.");
		} else {
			System.out.println("수정 실패!");
		}
	}
}
