package javapro.API;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("문자입력>>");
		String str=sc.next();
		String regExp="[abcde]";
		boolean result=Pattern.matches(regExp, str);					//문자열중에 한문자가 있는지 확인
																		//^문자열을 하면 이중에 없는걸 쳐야 true값
																		//a-zA-Z 영문자 아무거나 쳐도 true값
		if(result) {
			System.out.println("올바른 입력 처리");
		}
		else {
			System.out.println("입력 오류");
		}
		
		System.out.print("전화번호 입력>>");
		String phoneNumber=sc.next();
		String regExp2="(02|010-\\d{3,4}-\\d{4})";						//d{3,4}->자릿수가 3또는 4
		boolean result2=Pattern.matches(regExp2, phoneNumber);
		if(result2) {
			System.out.println("올바른 전화번호입니다.");
		}
		else {
			System.out.println("전화번호 형식이 아닙니다.");
		}
		
		System.out.print("이메일 입력>>");
		String email=sc.next();
		String regExp3="\\w+@\\w+\\.\\w+(\\.\\w+)?";					//w+ : 한문자 이상	
																		
		boolean result3=Pattern.matches(regExp3, email);
		if(result3) {
			System.out.println("올바른 이메일주소입니다.");
		}
		else {
			System.out.println("이메일주소 형식이 아닙니다.");
		}	
	}

}
