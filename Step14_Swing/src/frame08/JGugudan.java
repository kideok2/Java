/*
 * package frame08;
 * 
 * import java.awt.FlowLayout; import java.awt.event.ActionEvent;
 * import java.awt.event.ActionListener; import javax.swing.JButton;
 * import javax.swing.JFrame; import javax.swing.JTextArea;
 * import javax.swing.JTextField;  
 * public class JGugudan extends JFrame implements ActionListener {
 *     JTextField tf1;     JTextArea ta1;     int gugudan;     int dan;  
 *     public JGugudan() {         setTitle("구구단");
 *         setDefaultCloseOperation(EXIT_ON_CLOSE);
 *         tf1=new JTextField(10);         JButton b1=new JButton("구구단");
 *         ta1=new JTextArea(10,20);         setLayout(new FlowLayout());
 *         add(tf1);         add(b1);         add(ta1);
 *         b1.addActionListener(this);
 *         tf1.addActionListener(this); //엔터를 누르면 버튼이 실행
 *         setSize(400,300);         setVisible(true);     }     
 *     public static void main(String[] args) {         new JGugudan();     }
 *          @Override     public void actionPerformed(ActionEvent e) {
 *         ta1.setText(""); //그 전에 썼던 글자를 지우기 위해.
 *         //TextField에 있는 문자를 받아와서 정수형으로 반환         //단을 가져와서 for문 이용
 *         try {             //숫자가 아닌 걸 parseInt하면 오류발생. 그때 오류 메시지 써주기
 *             int dan = Integer.parseInt(tf1.getText()); 
 *             for(int i=1;i<10;i++) {
 *                 ta1.append(dan+"*"+i+"="+dan*i+"\n");             }
 *         } catch (NumberFormatException n) {
 *             tf1.setText("숫자를 입력하세요.");         }     } }
 */