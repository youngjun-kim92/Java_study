package javapro.reference;

public class ArrayEx07 {

	public static void main(String[] args) {
		
		System.out.println("** 로또 자동 번호 생성 **");
		
		int[] lotto=new int[6];
		boolean run=true;
		
		while(run) {
			for(int i=0;i<lotto.length;i++) {
				lotto[i]=(int)(Math.random()*45)+1;
			}
			
			//알고리즘 이용
			run=false;
			
			Outer:for(int a=0; a<lotto.length-1;a++) {								
				for(int b=a+1;b<lotto.length;b++) {
					if(lotto[a]==lotto[b]) {									
						run=true;
						break Outer;							//같은 값이 없으면 Outer 밑에는 실행이 안되므로 run에 false가 들어가서 while문 종료
					}
				}
			}//for(Outer)
			
		}//while
		
		//자동번호 출력
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+"  ");
		}
	}

}
