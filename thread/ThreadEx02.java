package javapro.thread;

public class ThreadEx02 {

	public static void main(String[] args) {
		Thread thread=new WorkerThread();		//스레드 객체 생성
		thread.start();							//굳이 메소드를 안써도 되나?
		
		for(int i=1;i<=5;i++) {
			System.out.println("띵");					
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
