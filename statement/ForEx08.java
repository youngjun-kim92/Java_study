package javapro.statement;

public class ForEx08 {

	public static void main(String[] args) {
		
		for(int i=1;i<=15;i++) {
			for(int j=1;j<=15-i;j++) {				//공백이 1씩 줄어드는 for문
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {				//홀수 별표 찍는 for문
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
