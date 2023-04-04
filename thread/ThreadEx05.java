package javapro.thread;

import java.awt.Toolkit;

public class ThreadEx05 {										

	public static void main(String[] args) {
		
		Thread thread=new Thread(()->{							//ThreadEx01을 람다식으로 표현한것!! 서로 비교하기
			Toolkit tkit=Toolkit.getDefaultToolkit();
			for(int i=1;i<=5;i++) {
				tkit.beep();
				try {
					Thread.sleep(500);						
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		});
		
		
		thread.start();											//스레드 시작하기
		
		//메인 메소드에서 실행되는 스레드								//내가만든 스레드하고 메인메소드 스레드가 동시에 실행
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
