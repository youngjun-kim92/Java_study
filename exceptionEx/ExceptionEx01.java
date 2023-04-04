package javapro.exceptionEx;

public class ExceptionEx01 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=2;
		
		try {
			int result=num1/num2;
			System.out.println("결과 = "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됩니다.");
		}
		finally {
			System.out.println("마무리 실행");
		}
		
	}

}
