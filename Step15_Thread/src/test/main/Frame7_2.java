package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//구구단 출력하기 기본 + 1초씩 지연시키기 
// + main 메소드에서 빼네서 하나의 쓰레드로 만들기(이유: 계속 메소드를 잡아먹고 있음 다른
//게 실행이 안되기 때문에
public class Frame7_2 extends JFrame implements ActionListener{
	JTextField tf;
	
	// 생성자
	public Frame7_2(String title) {
		super();
		//레이아웃 설정
		setLayout(new FlowLayout());
		// 입력칸 + 출력하기 버튼
		this.tf= new JTextField(10);
		JButton printBtn=new JButton("출력하기");
		
		add(tf);
		add(printBtn);
		
		//버튼에 리스너 등록
		printBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //구구단 계산 하는 부분
		//main 스레드에서는 새로운 스레드를 시작만 시키고
		new Thread(()-> {
				//입력한 문자열을 읽어온다.
				String inputNum=tf.getText();
				//입력한 숫자형태의 문자열을 실제 정수로 바꾸기
				int num=Integer.parseInt(inputNum);
				for(int i=0; i<9; i++) {
					//1초씩 지연시키기
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					
					int result = num * (i+1);
					System.out.println(num+" X "+(i+1)+" = "+result);
				}	
			}).start();
			//바로 리턴한다
			System.out.println("actionPerformed() 메소드가 리턴됩니다.");
		
	}
	
	public static void main(String[] args) { // 실행했을 때 디자인 구역
		JFrame frame=new Frame7_2("구구단 예제");
		
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(100, 100, 500, 500);
	    frame.setVisible(true);
	   }

	
}
