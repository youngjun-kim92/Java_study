package javapro.statement;

public class ForEx07 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println(); <-- 등등 많은 방법이 존재한다...*/
		
	}
}
