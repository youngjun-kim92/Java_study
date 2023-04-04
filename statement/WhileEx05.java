package javapro.statement;

import java.util.Scanner;

public class WhileEx05 {

	public static void main(String[] args) {				
		
		Scanner sc=new Scanner(System.in);
		int money;
		
		while(true) {
			System.out.print("--------------------------------\n1.예금 | 2. 출금 | 3. 잔고 | 4. 종료\n--------------------------------\n");
			System.out.print("선택> ");
			int n=sc.nextInt();
			if(n==1) {
				System.out.print("예금액> ");
				money=sc.nextInt();
			}
			if(n==2) {
				System.out.print("출금액> ");
				money=sc.nextInt();
			}
			if(n==3) {
				System.out.print("잔고> ");
				money=sc.nextInt();
			}
			if(n==4) {
				System.out.print("프로그램 종료");
				System.out.println();
				break;
			}
		}
		
	}
}
