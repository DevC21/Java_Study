package JAVA.ch13;

 class Ex13_8 {
	public static void main(String args[]) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();

		th1.start();
		th2.start();

		// try {
            // th1을 2초 동안 잠자게 하는게 아니라 sleep을 호출한 main 쓰레드가 잠들어버린다.
		// 	th1.sleep(2000);	
		// } catch(InterruptedException e) {}
        delay(2000);

		System.out.print("<<main 종료>>");
	} // main

    static void delay(int millis){
        try {
            Thread.sleep(millis);
		} catch(InterruptedException e) {}
    }
}

class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	} // run()
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2 종료>>");
	} // run()
}