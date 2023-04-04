package javapro.thread;

public class YieldEx01 {

	public static void main(String[] args) {
		
		WorkThread2 workA=new WorkThread2("workThreadA");				//setName으로 이름 처리
		WorkThread2 workB=new WorkThread2("workThreadB");
		
		workA.start();
		workB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		workA.work=false;
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		workA.work=true;
		
	}

}
