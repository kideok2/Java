package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz02 extends JFrame implements ActionListener {
   JTextField tf;
   JTextArea ta;
   
   public Quiz02(String title) {
      super(title);
      setLayout(new BorderLayout());
      //패널
      JPanel jp=new JPanel();
      tf=new JTextField(10);
      JButton appendBtn=new JButton("추가");
      JButton printBtn=new JButton("불러오기");
      ta =new JTextArea();
      //스크롤바를 만들어주는 객체
      JScrollPane jsp = new JScrollPane(ta);
      
      //패널의 배경색을 오렌지색으로 
      jp.setBackground(Color.ORANGE);
      //패널의 포레임의 북쪽에 배치
      add(jp, BorderLayout.NORTH);
      // 패널에 JTextField, JButton 2 개를 배치
      jp.add(tf);
      jp.add(appendBtn);
      jp.add(printBtn);
      
      //JTextArea 를 포함하고 있는 JScrollPane 을 프레임의 가운데에 추가하기
      add(jsp, BorderLayout.CENTER);
    
      appendBtn.addActionListener(this);
      printBtn.addActionListener(this);
   }
   
   public static void main(String[] args) {
      JFrame frame=new Quiz02("문자열 추가");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100,100,500,500);
      frame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      File memoFile=new File("c:/acorn202206/my_Folder/memo.txt");
      
      if(e.getActionCommand().equals("추가")) {
         String text=tf.getText();
         FileWriter fw=null;

         try {
            if(!memoFile.exists()) {
               JOptionPane.showConfirmDialog(this, "메모장을 만듭니다.");
               memoFile.createNewFile();
            }
            fw=new FileWriter(memoFile,true);
            //개행기호와 함께 파일에 출력하고
            fw.write(text+"\r\n");
            fw.flush();
            tf.setText("");
            
         } catch (FileNotFoundException e1) {
            e1.printStackTrace();
         } catch (IOException e1) {
            e1.printStackTrace();
         }finally {
            try {
               if(fw!=null)fw.close();
            } catch (IOException e1) {
               e1.printStackTrace();
            }
         }
      }else {
         ta.setText("");
         FileReader fr=null;
         BufferedReader br=null;
         if(!memoFile.exists()) {
            JOptionPane.showConfirmDialog(this, "불러올 메모장이 없습니다.");
         }else {
            try {
               fr=new FileReader(memoFile);
               br=new BufferedReader(fr);
               //반복문 돌면서 
               while(true) {
            	   //한줄씩 읽어내고
                  String line=br.readLine();
                  //만일 다 읽었다면
                  if(line==null) {
                     break; //반복문 탈출
                  }
                  //JTextArea 에 읽은 내용을 개행기호와 함께 출력하기
                  ta.append(line+"\n");
               }
            } catch (FileNotFoundException e1) {
               e1.printStackTrace();
            } catch (IOException e1) {
               e1.printStackTrace();
            }finally {
               try {
            	   //br 이 비었는지 확인해서 비지 않았다면 br 안에 들어있는
            	   //객체의 close() 매소드 호출
                  if(br!=null)br.close();//혹시나 해서지만 null값이 잡혀서 
                  if(fr!=null)fr.close();//딴데로 값이 튀어버리기 때문에
               } catch (IOException e1) {
                  e1.printStackTrace();
               }
            }
         }
      }
   }
}