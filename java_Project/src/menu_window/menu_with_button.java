package menu_window;

import java.awt.*;
import javax.swing.*;

class Menu extends JFrame {
	public Menu( ) {
		setSize(400,300);
		
		JPanel Tpanel = new JPanel();
		
		JButton b1 = new JButton("��Ʈ ����");
		JButton b2 = new JButton("�˶���");
		JButton b3 = new JButton("ȸ�� Ż��");
		JButton b4 = new JButton("������ ����");
		
		Tpanel.setLayout(new GridLayout(2,2));
		Tpanel.add(b1);
		Tpanel.add(b2);
		Tpanel.add(b3);
		Tpanel.add(b4);
		
		this.add(Tpanel);
		setVisible(true);
		
		
	}
}

public class menu_with_button {
	public static void main(String[] args) {
		Menu M = new Menu();
	}
}
