package javapro.API;

public class StringEx01 {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();							//Stringbuilder : String을 기억하는 임시기억장치(buffer) -> 새로운 객체를 생성하지 않고 문자열을 삭제, 수정 등을 해서 낭비되는 메모리를 방지
		sb.append("우리모두");
		sb.append("화이팅");												//append 메소드는 문자열 끝에 문자열을 추가하는 메소드
		System.out.println(sb.toString());
		
		sb.insert(4, "힘차게");    										//문자열 사이에 문자열을 삽입
		System.out.println(sb.toString());
		
		sb.setCharAt(7,'파');											//한 문자를 수정
		System.out.println(sb.toString());								
		
		sb.replace(4, 7, "아자아자");										//시작지점부터 끝지점까지 문자열을 수정
		System.out.println(sb.toString());
		
		sb.delete(8, 11);												//시작지점부터 끝지점까지 문자열 삭제
		System.out.println(sb.toString());
		
		String result=sb.toString();
		System.out.println(result);
	}

}
