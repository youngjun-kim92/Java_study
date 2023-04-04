package javapro.statement;

public class ForEx06 {

	public static void main(String[] args) {
		
		System.out.println("** 구구단 출력 **");
		for(int i=2;i<=9;i++) {
			System.out.println("** "+i+"단 **");
			for(int j=1;j<=9;j++) {
				System.out.println(i+" x "+j+" = "+i*j);	 		//가장 바깥 for문부터 조건이 참이므로 안쪽 for문 조건을 보고 그때도 참이므로 안쪽 for문 부터 순서대로 수행하고 그 다음에 바깥 for문 명령 수행
			}
			System.out.println("==================");
		}		
		
	}
}
