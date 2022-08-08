package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
// 0000 0000 0000 0000 | 2바이트는 65536가지로 표현됨
// 1111	1111 1111 1111 
public class MainClass02 {
	public static void main(String[] args) {
		//1byte 처리 스트림
		InputStream is=System.in;
		//2byte 처리 스트림
		InputStreamReader isr=new InputStreamReader(is);
		System.out.println("입력:");
		
		try {
			int code=isr.read();
			System.out.println("code: "+ code);
			//코드값에 대응되는 문자 얻어내기
			char ch=(char)code;
			System.out.println("char: "+ ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
