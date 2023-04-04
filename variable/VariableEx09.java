package javapro.variable;

public class VariableEx09 {

	public static void main(String[] args) {
		/*int num=10;
		byte bnum=(byte)num;
		System.out.println(bnum);*/
		byte num1=10;
		byte num2=20;
		int result=num1+num2;	//연산결과는 cpu에서 자동으로 int로 저장된다
		System.out.println(result);
		int value=10;
		double dvalue=5.3;
		double result2=value+dvalue;
		System.out.println(result2);
		int value1=10;
		double dvalue1=5.3;
		int result3=value1+(int)dvalue1;	//(int)(value1+dvalue1) 이렇게 해도 똑같이 나옴
		System.out.println(result3);

	}

}
