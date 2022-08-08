package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		/*
		 * 	위의 회원 정보를 MemberDao 객체를 이용해서 DB에 삭제하고 
		 * 	성공이면 "회원정보를 삭제 했습니다.
		 * 	실패면 "삭제 실패"
		 *  를 콘솔창에 출력하는 code를 작성해 보세요.
		 * */
		//삭제할 회원의 번호(primary key)
		int num=25;
		
		/*
		 * MemberDto dto=new MemberDto(); 
		 * dto.setNum(num);
		 * 
		 * MemberDao dao=new MemberDao();
		 * boolean isSuccess=dao.delete(num);
		 */
		
		//위의 주석처리된 4줄을 한줄로 씀
		boolean isSuccess=new MemberDao().delete(num);
		if(isSuccess) {
			System.out.println("회원 정보를 삭제 했습니다.");
		} else {
			System.out.println("삭제 실패");
		}
	}
}
