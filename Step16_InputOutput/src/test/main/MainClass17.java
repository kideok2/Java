package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainClass17 { 
	public static void main(String[] args) {
	/* Quiz1
	 * Scanner 객체를 이용해서 문자열 한 줄을 입력 받은 다음
	 * c:/acorn202206/myFolder/quiz.txt 파일을 만들어서
	 * 해당 파일에 문자열을 저장해 보세요.
	 * */
		Scanner scanner=new Scanner(System.in);
		System.out.println("문자 입력: ");
		String line=scanner.nextLine();
		FileWriter fw;
		try {
			//파일에 문자열을 출력 할 수 있는FileWriter 객체
			fw=new FileWriter("c://acorn202206/my_Folder/quiz.txt");
			fw.write(line);
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
