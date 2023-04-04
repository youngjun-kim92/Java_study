package javapro.collection;

import java.util.List;
import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		
		//Vector하고 Arraylist는 사용법은 같다. 단 Vector는 스레드환경에서 쓰인다.
		List<Board> blist=new Vector<>();
		
		Thread threadA=new Thread() {
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					blist.add(new Board("안녕"+i, "모두 파이팅"+i, "홍길동"));
				}
			}
		};
		
		Thread threadB=new Thread() {
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					blist.add(new Board("안녕"+i, "모두 잘가세요"+i, "김철수"));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		try {
			threadA.join();
			threadB.join();
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("총 게시글 수 : "+blist.size());

	}

}
