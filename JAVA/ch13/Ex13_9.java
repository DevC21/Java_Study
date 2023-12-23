package JAVA.ch13;

import javax.swing.JOptionPane;

class Ex13_9 {
	public static void main(String[] args) throws Exception 	{
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt();   // interrupt()를 호출하면, interrupted상태가 true가 된다.
		System.out.println("isInterrupted():"+ th1.isInterrupted()); // true
        // interrupted는 이 메서드를 실행한 쓰레드를 검사하므로 main쓰레드가 interrupt되었는지 확인된다.
		System.out.println("Interrupted():"+ Thread.interrupted()); // false
	}
}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;

		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<2500000000L;x++); // 시간 지연
		}
        
        System.out.println("isInterrupted():"+ this.isInterrupted()); // true
		System.out.println("Interrupted():"+ Thread.interrupted()); // true
        // isInterrupted()와 달리 interrupted()는 interrupted라는 상태변수를 false로 초기화함
		System.out.println("Interrupted():"+ Thread.interrupted()); // false
		System.out.println("카운트가 종료되었습니다.");
	} // main
}
