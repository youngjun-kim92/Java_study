package javapro.operator;

import java.util.Scanner;

public class OperatorEx03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("수량을 입력 : ");
		int amount=sc.nextInt();
		int price=1000;
		String memo="(정상가)";
		
		if(amount>=10) {
			price=800;
			memo="(할인가)";
		}
		else;
		
		int salesprice=amount*price;
		
		
		System.out.println("판매금액 = "+salesprice+"원"+memo);

	}

}
