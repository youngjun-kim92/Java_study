package javapro.statement;

public class ForEx14 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("1부터 100사이의 3의 배수의 총합 = "+sum);
	}
		
}

