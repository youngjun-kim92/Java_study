package javapro.operator;

public class OperatorEx13 {

	public static void main(String[] args) {
		
		double num1=5;
		double num2=0.0;
		double result=num1/num2;
		if(Double.isInfinite(result)) {					//<--값이 infinite인지 판단하는 클래스 (Ex07에서 배운 try,catch랑 비교할 것!!)
			System.out.println("0으로 나누면 안됩니다.");
		}else {
			System.out.println(result);
		}
	}

}
