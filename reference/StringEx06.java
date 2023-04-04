package javapro.reference;

public class StringEx06 {

	public static void main(String[] args) {
		
		String str1="나는 지금 서울 종로구에 있다.";
		int location=str1.indexOf("서울");
		System.out.println(str1.substring(location));
		
		boolean result=str1.contains("서울");					//boolean ~ = ~.contains(문자열) : 문자열이 있는지 없는지 참,거짓만 판별해줌
		
		if(result) {
			System.out.println("서울과 관련이 있군요");
		}
		else {
			System.out.println("서울과 관련이 없군요");
		}
		
	}

}
