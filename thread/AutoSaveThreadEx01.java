package javapro.thread;

public class AutoSaveThreadEx01 {

	public static void main(String[] args) {
		
		//AutoSaveThread가 하는일
		AutoSaveThread autoSave=new AutoSaveThread();
		autoSave.setDaemon(true); 								//데몬스레드 : 주 스레드의 보조역할을 하는 스레드(주 스레드가 종료되면 데몬스레드가 자동으로 종료된다)
		autoSave.start();
		
		
		//메인Thread가 하는일										--> 둘이 동시에 실행
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1부터 100까지의 합 = "+sum);

	}

}
