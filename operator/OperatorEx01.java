package javapro.operator;

public class OperatorEx01 {

	public static void main(String[] args) {
		//정확한 계산은 정수 연산으로
		//산술 연산을 정확히 하려면 실수 타입을 정수타입으로 변환하고 하는게 좋다
		int apple=1;
		double pieceUnit=0.1;
		int number=7;
		double result=apple-number*pieceUnit;
		
		System.out.printf("%.1f",result);
		
		

	}

}
