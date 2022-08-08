package test.main;

import java.io.File;

public class MainClass08 {
	public static void main(String[] args) {
		File f=new File("c:/");
		//파일 객체 목록(File[])을 얻어내기
		File[] files=f.listFiles();
		//반복문 돌면서 File 객체를 하나씩 참조해서
		for(File tmp:files) {
			
			//만일 해당 파일이 디렉토리라면
			if(tmp.isDirectory()) {
				//대괄호를 디렉토리명 양쪽에 출력하기
				System.out.println("["+tmp.getName()+"]"); //폴더는 대괄호로 감싸고
			}else {
				System.out.println(tmp.getName()); // 파일은 그냥 이름만 출력
			}
		}
	}
}
