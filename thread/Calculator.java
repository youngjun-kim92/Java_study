package javapro.thread;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory1(int memory) {									//synchronized는 스레드가 잠겨서 다른 스레드가 간섭을 못함 ->해제될때까지 다른객체가 접근 못함
		this.memory = memory;															//메소드가 다 작동하면 다음 메소드가 작동
		try {																			//메소드 이름에 synchronized를 주면 전체가 잠김
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"->"+this.memory);
	}
	
	public void setMemory2(int memory) {												//이렇게 synchronized(this)하면 일부만 잠김
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"->"+this.memory);
		}
		
	}
	
}
