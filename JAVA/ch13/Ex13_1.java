package JAVA.ch13;

public class Ex13_1 {
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r  = new ThreadEx1_2();
		Thread   t2 = new Thread(r);	  // 생성자 Thread(Runnable target)

        // OS 스케줄러가 쓰레드의 실행 순서를 결정한다.
		t1.start(); // 0을 출력
		t2.start(); // 1을 출력
	}
}

class ThreadEx1_1 extends Thread { // Thread클래스를 상속해서 쓰레드를 구현
	public void run() { // 쓰레드가 수행할 작업을 작성
		for(int i=0; i < 500; i++) {
			System.out.print(0); // 조상인 Thread의 getName()을 호출
		}
	}
}

class ThreadEx1_2 implements Runnable { // Runnable인터페이스를 구현해서 쓰레드를 구현
	public void run() { // 쓰레드가 수행할 작업을 작성
		for(int i=0; i < 500; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.print(1);;
		}
	}
}
