package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MainClass16 {
	public static void main(String[] args) {
		// 1. HashSet 객체를 생성해서 참조값을 정수를 저장할 수 있는 Set 인터페이스 type
		// 변수를 담아 보세요.
		Set<Integer> type=new HashSet<>();
		/*
		 * 2. 반복문 돌면서 1~45 사이의 랜덤한 정수를 얻어내서 HashSet 객체를 담아보세요
		 *    총 6개가 담길 때 까지 반복문이 돌아야 합니다.
		 *    주의) 우연히 이전에 나왔던 동일한 숫자가 나오면 HashSet 은 하나만
		 *    저장하는 걸 잊지 마세요.
		 */
		Random ran=new Random(); 
		//외형상 무한루프인  while 문을 구성하고
		while(true) {
			int ranNum=ran.nextInt(45)+1;
			type.add(ranNum);
			//만일 Set 의 사이즈가 6이 되면
			if(type.size()==6) { //or if(type.size() > 5)
				break;//반복문 탈출하기
			}
		}
		
		//Set 의 사이즈 가 6이 아니면 반복문을 돌아라 (Set의 사이즈가 6이면 반복문 탈출)
		while(type.size() != 6) {
			int ranNum=ran.nextInt(45)+1;
			type.add(ranNum);
			}
		
		//Set의 사이즈가 6보다 작으면 반복문을 돌아라(Set의 6이되면 반복문 탈출)
		while(type.size() != 6) {
			int ranNum=ran.nextInt(45)+1;
			type.add(ranNum);
			}
		
		/*
		 * for(int i=0; i<6; i++) { int ranNum=ran.nextInt(45)+1; set.add(ranNum); }
		 */
		// 3. HashSet 객체에 담긴 숫자를 콘솔창에 하나하나 씩 모두 출력해 보세요. 
		//System.out.println(a); 이 코드는 중복이 나오면 6개가 출력이 안됨
		Iterator<Integer> it=type.iterator();
		 while(it.hasNext()) {
	         int num=it.next();
	         System.out.println(num);
		}
	}
}
