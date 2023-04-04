package javapro.operator;

import java.util.Scanner;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력 : ");
		int score=sc.nextInt();
		String memo="다음에 다시 응시해주세요";
		
		if(score>=80)
			memo="합격입니다.";
			
		System.out.println(memo);
		System.out.println("수고하셨습니다.");

	}

}
