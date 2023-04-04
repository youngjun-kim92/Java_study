package javapro.operator;

import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("구입 수량은>> ");
		int amount=sc.nextInt();
		System.out.print("판매 단가는>> ");
		int price=sc.nextInt();
		String memo="(정상가)";
		if(amount>=10) {
			price=(int)(price*0.8);
			memo="(할인가)";
		}
		int salesPrice=amount*price;
		System.out.println("판매금액 : "+salesPrice+"원"+memo);
	}

}
