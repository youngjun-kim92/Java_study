package javapro.classEx;

public class CalculatorEx01 {

	public static void main(String[] args) {
		
		Calculator myCalc=new Calculator();
		
		int result1=myCalc.add(12, 25);
		System.out.println("합계 = "+result1);
		
		int result2=myCalc.add(12, 25, 74);
		System.out.println("합계 = "+result2);
		
		int[] values= {10,95,74,30,40,60,88,77};				
		int result3=myCalc.add(values);
		System.out.println("합계 = "+result3);
		
		int result4=myCalc.add(new int[] {12,30,40,60});			//익명 개체 배열
		System.out.println("합계 = "+result4);
		
	}

}
