package javapro.statement;

import java.util.Scanner;

public class IFEx02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수를 입력>> ");
		int score=sc.nextInt();
		
		if(score>=0&&score<=100) {
			if(score>=90) 
				System.out.println("A등급");
			else if(score>=80)						//구간에 관한 if~else if문은 굳이 구간을 &&할 필요없이 최소값만 설정해주면 된다. 알아서 구간이 설정됨
				System.out.println("B등급");			//중첩 if문 사용
			else if(score>=70)
				System.out.println("C등급");
			else if(score>=60)
				System.out.println("D등급");
			else
				System.out.println("F등급");
		} else {
			System.out.println("점수 입력 오류");
		}
	}

}
