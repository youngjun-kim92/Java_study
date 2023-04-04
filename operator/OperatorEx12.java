package javapro.operator;

public class OperatorEx12 {

	public static void main(String[] args) {
		
		/*int value=416;
		System.out.println(value/100*100);*/
		
		double value=23.51423;
		value=(int)(value*100)/100.0;
		
		System.out.println(value); 		//소수이하 2자리까지 출력
		
	}

}
