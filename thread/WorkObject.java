package javapro.thread;

public class WorkObject {
	
	public synchronized void methodA() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+"-> methodA 작업 실행");
		notify();																		//notify : 일시정지된 스레드를 다른 스레드로 풀어준다. -> threadA는 threadB를 풀어줌
		try {
			wait();																		//wait : 자신의 스레드를 일시정지
		} catch (InterruptedException e) {												//결국 한번씩 번갈아가면서 실행
			e.printStackTrace();
		}
		
	}
	
	public synchronized void methodB() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+"-> methodB 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
