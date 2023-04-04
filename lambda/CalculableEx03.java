package javapro.lambda;

public class CalculableEx03 {

	public static void main(String[] args) {
		Calculable calculable;
		
		calculable=(x,y)->{												//인터페이스 override한 부분을 람다식으로 표현한것
			System.out.println("두 수의 합 = "+(x+y));						//람다식으로 표현하려면 인터페이스가 단 하나의 추상메소드만 갖고있어야만 가능
		};																//그렇지 않으면 오류남 -> 람다식은 추상메소드 이름이 생략되고 override한거라고 생각하면 됨(인터페이스에 메소드가 하나밖에 없으니 가능한것) 
		
		calculable.calculate(23, 13);
		
		calculable=(x,y)->{
			System.out.println("두 수의 차 = "+(x-y));
		};
		
		calculable.calculate(23, 13);

	}

}
