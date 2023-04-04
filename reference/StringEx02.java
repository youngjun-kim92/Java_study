package javapro.reference;

public class StringEx02 {

	public static void main(String[] args) {
		
		/*String str1="오늘은 자바객체 배우는 날";
		char ch=str1.charAt(5);					//~.charAt()은 한 문자를 가져오는 메소드로 0부터 시작(공백도 문자)
		System.out.println(ch);*/
		
		String ssn="950425-1234567";
		char ch=ssn.charAt(7);
		
		if(ch=='1'||ch=='3') {
			System.out.println("남성");
		}
		else if(ch=='2'||ch=='4') {
			System.out.println("여성");
		}
		else {
			System.out.println("성별오류");
		}
		
	}

}
