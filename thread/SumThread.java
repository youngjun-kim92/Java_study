package javapro.thread;

public class SumThread extends Thread {
	
	private int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {						//얘는 run메소드로 실행하는게 아니라 스레드 객체를 생성해서 start로 실행
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		
		
	}

}
