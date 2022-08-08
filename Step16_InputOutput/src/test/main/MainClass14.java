package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		File memoFile=new File("c://acorn202206/my_Folder/memo.txt");
		
		//필요한 객체를 담을 지역 변수를 미리 만들어 둔다.
		FileReader fr=null;
		BufferedReader br=null;
		try {
			//파일에서 문자열을 읽어들일 수 있는 객체 생성
			fr = new FileReader(memoFile);
			br=new BufferedReader(fr);
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
		} finally { // 예외가 발생 하던 안하던 실행이 반드시 보장되는 블럭
			try {
				if(br!=null)br.close();  //null이 아니면!
				if(br!=null)fr.close();  //->if문이 한줄 짜리면 {}(중괄호) 필요없음!!!!!
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
