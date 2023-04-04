package javapro.variable;

public class VariableEx01 {

	public static void main(String[] args) {
		int hour=3;		//변수 : 어떤 값을 기억하는 기억장소 (타입 변수의 이름=값;)
		int minute=60*hour;
		
		System.out.println(minute+"분");
		System.out.println("김철수"+"파이팅");	//+는 산술연산자와 연결연산자 둘로 쓰이며 숫자끼리 있을때만 산술연산자로 쓰임
		
		int score=80;
		
		System.out.println("시험성적 : "+(80+10)); 	//문자 + 숫자로 연결될 경우 숫자도 문자취급한다. 따라서 80+10괄호 안하면 문자취급해서 연결연산자로 쓰이므로 8010으로 출력됨
		System.out.println(hour+"시간은 총 "+minute+"분입니다.");
		
	}

}
