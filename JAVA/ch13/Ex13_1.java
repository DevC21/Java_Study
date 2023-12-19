package JAVA.ch13;

public class Ex13_1 {
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r  = new ThreadEx1_2();
		Thread   t2 = new Thread(r);	  // ������ Thread(Runnable target)

        // OS �����ٷ��� �������� ���� ������ �����Ѵ�.
		t1.start(); // 0�� ���
		t2.start(); // 1�� ���
	}
}

class ThreadEx1_1 extends Thread { // ThreadŬ������ ����ؼ� �����带 ����
	public void run() { // �����尡 ������ �۾��� �ۼ�
		for(int i=0; i < 500; i++) {
			System.out.print(0); // ������ Thread�� getName()�� ȣ��
		}
	}
}

class ThreadEx1_2 implements Runnable { // Runnable�������̽��� �����ؼ� �����带 ����
	public void run() { // �����尡 ������ �۾��� �ۼ�
		for(int i=0; i < 500; i++) {
			// Thread.currentThread() - ���� �������� Thread�� ��ȯ�Ѵ�.
			System.out.print(1);;
		}
	}
}
