package javapro.statement;

import java.util.Scanner;

public class IFEx01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수를 입력>> ");
		int score=sc.nextInt();
		
		if(score>=80) {
			System.out.println("합격하셨습니다.\n12월 28일까지 회사에 방문해주세요.");
		}
		else
			System.out.println("불합격하셨습니다.\n다음에 응시해 주세요.");
		System.out.println("수고하셨습니다.");
	}

}
