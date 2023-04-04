package javapro.thread;

public class SumThreadEx01 {

	public static void main(String[] args) {
		
		SumThread sumt=new SumThread();
		sumt.start(); 								//자동으로 run메소드를 수행
		
		
		try {
			sumt.join();							//start한 스레드가 종료될때까지 다른 스레드는 멈춤(스레드 우선처리)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("1부터 100까지의 합 = "+sumt.getSum());

	}

}
