package javapro.reference;

import java.util.Scanner;

public class ArrayEx16 {

	//연습문제 9
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int students=0;
		boolean run=true;
		double avg=0;
		int[] scores=null;																		//null로 초기화 시켜주는거 잊지말기!!
		
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			int menuNum=sc.nextInt();
			
			switch(menuNum) {
				case 1:
					System.out.print("학생수> ");
					students=sc.nextInt();
					scores=new int[students];
					break;
				case 2:
					for(int i=0;i<scores.length;i++) {
						System.out.print("scores["+i+"]> ");
						scores[i]=sc.nextInt();
					}
					break;
				case 3:
					for(int i=0;i<scores.length;i++) {
						System.out.println("scores["+i+"]: "+scores[i]);
					}
					break;
				case 4:
					int max=0;
					int sum=0;
					for(int i=0;i<scores.length;i++) {
						if(max<scores[i]) {
							max=scores[i];
						}
					}
					System.out.println("최고 점수 : "+max);
					for(int i=0;i<scores.length;i++) {
						sum+=scores[i];
						avg=(double)sum/(double)students;
					}
					System.out.println("평균 점수 : "+avg);
					break;
				case 5:	
					run=false;
					break;
				default: 
					System.out.println("숫자를 다시 입력하세요");
					break;	
			}
			
		}
		System.out.println("프로그램을 종료합니다.");	
		
	}

}
