package javapro.reference;

public class StringEx07 {

	public static void main(String[] args) {
		
		String str="박찬호,김철수,이영희,홍길동,이영표";
		String[] names=str.split(",");						//~.split(문자열) : 문자열을 기준으로 분리하여 배열로 저장 --> 괄호안에 문자열은 구분자로 인식되어 출력때 표시되지 않음
		
		System.out.println("** 합격자 명단 **");
		
		for(int i=0;i<names.length;i++) {
			System.out.println("이름 : "+names[i]);
		}
		
	}

}
