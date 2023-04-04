package javapro.thread;

public class ThreadEx04 {

	public static void main(String[] args) {
		
		Thread cthread=Thread.currentThread();							//.currentThread : 현재 돌아가고 있는 스레드 정보
		System.out.println(cthread.getName()+" 스레드 실행"); 				//현재 돌아가고 있는 스레드의 이름
		
		for(int i=0;i<3;i++) {
			Thread threadA=new Thread() {

				@Override
				public void run() {
					System.out.println(getName()+" 스레드 실행");			//getName : 이름 갖고오기
				}														//스레드는 무조건 start를 해줘야 실행됨
				
			};
			threadA.setName("myThread-"+i); 							//setName : 이름 셋팅
			threadA.start();
		}
	}

}
