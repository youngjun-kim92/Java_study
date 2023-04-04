package javapro.variable;

public class VariableEx06 {

	public static void main(String[] args) {
		
		int money=78630;
		
		int m10000=money/10000;
		money=money%10000;
		
		int m5000=money/5000;
		money=money%5000;
		
		int m1000=money/1000;
		money=money%1000;
		
		int m500=money/500;
		money=money%500;
		
		int m100=money/100;
		money=money%100;
		
		int m10=money/10;
		money=money%10;
		
		
		System.out.println("만원 : "+ m10000+"장");
		System.out.println("오천원 : "+ m5000+"장");
		System.out.println("천원 : "+ m1000+"장");
		System.out.println("오백원 : "+ m500+"개");
		System.out.println("백원 : "+ m100+"개");
		System.out.println("십원 : "+ m10+"개");

	}

}
