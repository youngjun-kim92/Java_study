package javapro.statement;

public class ForEx10 {

	public static void main(String[] args) {
		
		/*문제) 보물섬 찾으러 배를 타고 항해
		  
		 동굴 => 2kg -> 30개
		 		3kg -> 30개
		 		
		 배가 견딜 수 있는 무게 100kg => 각종 장비+탐험가=70kg
		 보물 = 30kg까지만 실을 수 있다. 		*/
		
		int sum;
		for(int i=1;i<30;i++) {
			for(int j=1;j<30;j++) {
				sum=i*2+j*3;
				if(sum==30) {
					System.out.println("2kg 보물 : "+i+"개"+"\n3kg 보물 : "+j+"개");
					System.out.println("=============");
				}
			}
		}
		
		
	}
}
