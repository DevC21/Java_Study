package JAVA.ch7;

import java.awt.*;
import java.awt.event.*;

class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
//		b.addActionListener(new EventHandler()); // 2. ��ü ����
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        }); // 1�� 2�� ���ÿ� ����
	}
}

// 1. Ŭ���� ����
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}