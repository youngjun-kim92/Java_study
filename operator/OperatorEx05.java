package javapro.operator;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		//증가연산자 : ++, 감소연산자 : --
		//++변수 : 전위증가연산자 , 변수++ : 후위증가연산자
		
		int num=10;
		num++;	//num=num+1;
		
		//증감연산자는 반드시 단독으로 쓰기
		//전위연산자는 계산에 참여가 가능하지만 후위연산자는 계산에 참여안되고 나중에 계산된다.
		
		System.out.println(num);
		
		int num1=50;
		int num2=200;
		
		//int max=(조건)?값 또는 수식 : 값 또는 수식; <--삼항연산자
		int max=(num1>num2)?num1:num2; 	//결국 int max=num1 이냐 num2냐 묻는거
		
		System.out.println("두 수 중에 큰 값 : "+max);

	}

}
