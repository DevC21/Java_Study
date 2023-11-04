package JAVA.ch7;

import java.awt.*;
import java.awt.event.*;

class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
//		b.addActionListener(new EventHandler()); // 2. 객체 생성
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        }); // 1과 2를 동시에 수행
	}
}

// 1. 클래스 정의
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}