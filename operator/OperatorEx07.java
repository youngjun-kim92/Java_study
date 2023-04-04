package javapro.operator;

public class OperatorEx07 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=0;
		
		try {												//try : 블록내에 있는 명령을 수행 --> 정상적으로 수행이 되면 catch로 넘어가지 않음
			int result=num1/num2;
			System.out.println("연산결과 = "+result);
		}
		catch (ArithmeticException e) { 					//catch : 예외처리가 발생하지 않으면 수행하지 않음 --> try에서 예외가 발생하면 수행
			System.out.println("0으로 나누면 안됩니다.");			//ArithmeticException e --> 연산과정에서 에러가 발생 / e는 에러에 대한 상세 메세지를 나타냄 --> 출력하려면 printout(e.getMessage())								
		}
	}

}
