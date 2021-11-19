package chat_window;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class chatFrame extends JFrame {
	public chatFrame() {
		setSize(400,300); // 10, 10 �� �������ϱ� ���� 380, 280 �� ��ü ũ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Tpanel = new JPanel(); Tpanel.setSize(380,280); // ���� �г�
		
		JPanel top = new JPanel();
		
		
		JLabel nameOfChatRoom = new JLabel("ä�ù� �̸� ������ �޾ƿ���"); // ��ܿ� �����ִ� ä�ù� �̸�
		top.add(nameOfChatRoom); // ž �гο� ä�ù� �̸� �� �ֱ�
		nameOfChatRoom.setBounds(1, 1, 5, 5);
		
		JPanel textPanel = new JPanel();
		JTextArea textArea = new JTextArea(10,36); // ���� �� �ؽ�Ʈ�� �����ִ� ��
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_ALWAYS);
		textPanel.add(scroll);
		
		JPanel bottom = new JPanel();// a+b�� ���� �г� // �г� �� �ؿ� ��ġ��Ŵ
		JTextField tf = new JTextField(25); // ä���� ġ�� �� -- a
		JButton button = new JButton("����"); // ä�� ġ�� ��ư ������ �� -- b
		
		
		bottom.add(tf, BorderLayout.CENTER); // bottom �гο� �ؽ�Ʈ �ʵ� �߰�
		bottom.add(button, BorderLayout.CENTER); // bottom �гο� "Ȯ��" ��ư �߰�
		
		
		Tpanel.add(top, BorderLayout.PAGE_START);
		Tpanel.add(textPanel, BorderLayout.CENTER); // �ؽ�Ʈ �����ִ� TestArea �߰�
		Tpanel.add(bottom, BorderLayout.PAGE_END); // bottom �г� �߰�
		this.add(Tpanel); // ���� Tpanel �߰�
		
		setVisible(true);
		
	}
}

public class chatplace {
	public static void main(String[] args) {
		chatFrame cf = new chatFrame();
	}
}
