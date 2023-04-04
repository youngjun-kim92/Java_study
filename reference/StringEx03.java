package javapro.reference;

public class StringEx03 {

	public static void main(String[] args) {
		
		/*String str1="computer";
		System.out.println(str1.length()); 						//~.length()는 문자의 길이를 알려주는 메소드(()안은 매개변수를 넣는데 여기서는 매개변수가 없기 때문에 공백)
		*/
		
		String ssn="950425-1234567";
		int len=ssn.length();
		
		if(len==14) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}
		else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
		
	}
	

}
