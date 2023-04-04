package javapro.variable;

public class VariableEx04 {

	public static void main(String[] args) {
		
		byte num1=127;					//byte = 1byte(-128~127), short = 2byte, int = 4byte, long = 8byte (작은거에서 큰거는 옮길 수 있지만 큰거에서 작은거는 불가능)
		short num2=128;					//char = 2byte(문자열 하나를 나타낼때)
		int num3=1500000;
		long num4=350000000000L;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		//실수 float = 4byte, double = 8byte					byte<short<int<long<float<double
		
		float num5=4.5F;
		double num6=5E3;				//E는 10의 지수--> E3이면 10의 3승
		
		System.out.println(num5);
		System.out.println(num6);
		
		//boolean --> true, false값만 가짐
		

	}

}
