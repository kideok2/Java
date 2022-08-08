package test.main;
/*
 * 	HashSet 은 set 인터페이스를 구현한 클래스이다.
 * 	
 * 		- 순서가 없다.
 * 		- key 값도 없다.
 * 		- 중복을 허용하지 않는다.
 * 		- 어떤 data 를 묶음(집합)으로 관리하고자 할 때 사용한다.
 * */

import java.util.HashSet;
import java.util.Set;

public class MainClass11 {
	public static void main(String[] args) {
		//정수 값을 저장할 수 있는 HashSet 객체
		Set<Integer> set1=new HashSet<>(); //똑같은 데이터를 같지 않는다 = set
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		set1.add(20);
		
		//문자열을 저장할 수 있는 HashSet 객체
		Set<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("park");
		set2.add("lee");
		set2.add("kim");
		set2.add("lee");
	}
	//Set 함수엔 중복을 집어 넣으면 제거된다
}
