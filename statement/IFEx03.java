package javapro.statement;

import java.util.Scanner;

public class IFEx03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("키를 입력>> ");
		int height=sc.nextInt();
		
		System.out.print("몸무게를 입력>> ");
		int weight=sc.nextInt();
		
		double sdweight=(height-100)*0.9;
		
		if(weight>sdweight+5) {
			System.out.println("비만입니다. 운동하세요.");			//구간은 큰거부터 설정하자!!
		}
		else if(weight>=sdweight-5) {
			System.out.println("정상입니다. 꾸준히 유지하세요.");
		}
		else {
			System.out.println("마른 체형입니다. 밥 많이 드세요.");
		}
		
		
	}

}
