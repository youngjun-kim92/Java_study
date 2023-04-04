package javapro.API;

public class RunTimeEx01 {

	public static void main(String[] args) {
		
		long time1=System.nanoTime();
		long sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1부터 100까지의 합 = "+sum);
		
		long time2=System.nanoTime();
		System.out.println("계산에 "+(time2-time1)+"나노초가 소요되었습니다.");
		
	}

}
