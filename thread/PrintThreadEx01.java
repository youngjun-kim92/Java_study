package javapro.thread;

public class PrintThreadEx01 {

	public static void main(String[] args) {
		
		Thread thread=new PrintThread();
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt(); 						//interrupt메소드는 스레드가 일시정지 상태에 있을 때 InterruptedException 발생시킨다.

	}

}
