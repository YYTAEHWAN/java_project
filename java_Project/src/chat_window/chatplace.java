package chat_window;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class chatFrame extends JFrame {
	public chatFrame() {
		setSize(400,300); // 10, 10 줄 그을꺼니까 빼고 380, 280 을 전체 크기로 생각
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Tpanel = new JPanel(); Tpanel.setSize(380,280); // 최종 패널
		
		JPanel top = new JPanel();
		
		
		JLabel nameOfChatRoom = new JLabel("채팅방 이름 변수로 받아오기"); // 상단에 보여주는 채팅방 이름
		top.add(nameOfChatRoom); // 탑 패널에 채팅방 이름 라벨 넣기
		nameOfChatRoom.setBounds(1, 1, 5, 5);
		
		JPanel textPanel = new JPanel();
		JTextArea textArea = new JTextArea(10,36); // 오고 간 텍스트를 보여주는 곳
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_ALWAYS);
		textPanel.add(scroll);
		
		JPanel bottom = new JPanel();// a+b를 합한 패널 // 패널 맨 밑에 위치시킴
		JTextField tf = new JTextField(25); // 채팅을 치는 곳 -- a
		JButton button = new JButton("전송"); // 채팅 치고 버튼 누르는 것 -- b
		
		
		bottom.add(tf, BorderLayout.CENTER); // bottom 패널에 텍스트 필드 추가
		bottom.add(button, BorderLayout.CENTER); // bottom 패널에 "확인" 버튼 추가
		
		
		Tpanel.add(top, BorderLayout.PAGE_START);
		Tpanel.add(textPanel, BorderLayout.CENTER); // 텍스트 보여주는 TestArea 추가
		Tpanel.add(bottom, BorderLayout.PAGE_END); // bottom 패널 추가
		this.add(Tpanel); // 최종 Tpanel 추가
		
		setVisible(true);
		
	}
}

public class chatplace {
	public static void main(String[] args) {
		chatFrame cf = new chatFrame();
	}
}
