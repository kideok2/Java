package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass10 {
	public static void main(String[] args) throws IOException {
		//File f1=new File("c:/acorn202206/my_Folder/folder1");
		//폴더 만들기
		//f1.mkdir();
		/*
		 * 	위의 코드를 참고해서
		 * c:/acorn202206/my_Folder 폴더 안에
		 * 폴더 1000개를 만들어 보세요.
		 * 폴더명은 
		 * folder1
		 * folder2
		 * folder3
		 * ....
		 * folder1000
		 * */
		
		// 만일 해당 파일이 존재하면
		for(int i=0; i<1000; i++) {
			File f1=new File("c:/acorn202206/my_Folder/folder"+(i+1));
			//만일 폴더가 존재하면
			if(f1.exists()) {
				f1.delete(); //삭제
			} else { //존재하지 않으면
				f1.mkdir(); //만들기
			}
		}
	}
}
