package javapro.reference;

public class StringEx04 {

	public static void main(String[] args) {
		
		String str1="자바 프로그래밍";
		String str2=str1.replace("자바","JAVA");				//앞글자를 찾아서 있으면 뒷글자로 문자열을 대체  
		System.out.println(str2);							//but) 엄밀히 따지면 str1에 있는 문자열을 바꿔 출력이 아닌 str2에 원본문자열을 바꿔서 저장되어 출력
		System.out.println(str1);
		
		String str3="computer";
		System.out.println(str3.substring(3,6));	  		//~.substring(숫자,숫자) : 처음 숫자가 시작위치 그 다음 숫자가 마지막위치 '앞'에 자리까지 그 사이에 있는 문자열을 찍어줌
		System.out.println(str3.substring(5));	 			//뒤에 숫자를 입력안하면 시작위치부터 끝까지 출력
			
		String ssn="970512-1234567";
		System.out.println(ssn.substring(0,7)+"*******");
		
	}
	

}
