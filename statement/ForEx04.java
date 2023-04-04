package javapro.statement;

public class ForEx04 {

	public static void main(String[] args) {
		
		int sum=0;															//sum에 초기값 0을 반드시 넣어줘야한다. 안넣어주면 에러...
		int oddSum=0;
		int evenSum=0;
		
		/*for(int i=1;i<=100;i=i+2) {
			oddSum+=i;
		}
		System.out.println("1부터 100까지 홀수의 합 = "+oddSum);
		
		for(int i=2;i<=100;i=i+2) {
			evenSum+=i;
		}
		System.out.println("1부터 100까지 짝수의 합 = "+evenSum);
		
		for(int i=1;i<=100;i++) {
			sum+=i;															//sum=sum+i
		}
		System.out.println("1부터 100까지의 합 = "+sum);*/
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				evenSum+=i;
			}
			else {
				oddSum+=i;
			}
		}
		System.out.println("1부터 100까지 홀수의 합 = "+oddSum);
		System.out.println("1부터 100까지 짝수의 합 = "+evenSum);
		
		
		
		
		
		
		
	}
}
