package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		File memoFile=new File("c://acorn202206/my_Folder/memo.txt");
		
		try {
			//파일에서 문자열을 읽어들일 수 있는 객체 생성
			FileReader fr = new FileReader(memoFile);
			BufferedReader br=new BufferedReader(fr);
			while(true) {
				//문자열 한줄 읽어내기
				String line=br.readLine();//개행 기호는 읽어내지 않는다 =>
				// -> 더 이상 읽을 데이터가 없으면 반복문 탈출
				if(line==null) {
					break;
				}
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
