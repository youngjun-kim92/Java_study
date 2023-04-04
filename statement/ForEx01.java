package javapro.statement;

public class ForEx01 {

	public static void main(String[] args) {
		
		/*for(int i=1;i<=5;i++) {
			System.out.println("안녕하세요");				수행순서 int i=1 --> i<=5 --> 밑에 명령문 수행 --> i값 증가 --> i<=5 --> 밑에 명령문 수행 --> i가 5가 될때까지 수행 --> 종료
		}
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}*/
		
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
		}
	}
}
