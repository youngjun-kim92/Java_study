package javapro.statement;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		/*switch(변수) {
		case 값 :
			명령문
			break;
		case 값 :
			명령문
			break;
		default:
			명령문
		}*/												
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("여행지를 선택하세요(1. 미주 2. 유럽 3. 동남아)>> ");
		int choice=sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("1층 안내 데스크로 가세요");
				break;
			case 2:
				System.out.println("2층 안내 데스크로 가세요");
				break;
			case 3:
				System.out.println("별관 안내 데스크로 가세요");
				break;
			default:
				System.out.println("여행지 선택이 잘못되었습니다.");
		}
		
	}

}
