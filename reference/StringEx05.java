package javapro.reference;

public class StringEx05 {

	public static void main(String[] args) {
		
		String str1="자바는 웹개발자가 되기 위해 자바를 배우고 있다.";
		int pos=str1.indexOf("자바");								//~.indexOf() : 괄호안에 있는 특정한 문자열을 찾아 시작점을 알려주는 메소드(중복문자열이 있으면 가장 처음에 나오는 문자열만 나타내줌)
		System.out.println(pos);								//(문자열,숫자)로 입력하면 숫자가 시작점이 되어 그 이후에 나오는 문자열을 찾아줌
		
		int pos2=str1.lastIndexOf("자바");						//~.lastIndexOf() : 끝에서 부터 찾아 특정한 문자열을 찾아 시작점을 알려주는 메소드(끝에서부터 새지만 값은 처음부터 새는 값과 같은 값으로 나옴)
		System.out.println(pos2);
		
		String str2="비주얼베이직 입문";
		int pos3=str2.indexOf("자바");
		System.out.println(pos3);								//찾고자 하는 문자열이 없을경우 -1로 찍힘
		
		if(pos3==-1) {
			System.out.println("자바와 관련이 없는 책이군요");
		}
		else {
			System.out.println("자바와 관련된 책이군요");
		}
		
	}

}
