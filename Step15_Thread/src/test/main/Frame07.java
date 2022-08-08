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
//구구단 출력하기 기본
public class Frame07 extends JFrame implements ActionListener{
	JTextField tf;
	
	// 생성자
	public Frame07(String title) {
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
	public void actionPerformed(ActionEvent e) {
		//입력한 문자열을 읽어온다.
		String inputNum=tf.getText();
		//입력한 숫자형태의 문자열을 실제 정수로 바꾸기
		int num=Integer.parseInt(inputNum);
		for(int i=0; i<9; i++) {
			int result = num * (i+1);
			System.out.println(num+" X "+(i+1)+" = "+result);
		}
	}
	
	public static void main(String[] args) {
		JFrame frame=new Frame07("구구단 예제");
		
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(100, 100, 500, 500);
	    frame.setVisible(true);
	   }

	
}
