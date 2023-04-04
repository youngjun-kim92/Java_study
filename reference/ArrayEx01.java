package javapro.reference;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int[] scores= {75,90,80,66,96,82,74,88,80,71};
		int sum=0;
		int avg;
		for(int i=0;i<scores.length;i++) {					//i<scores.length에서 같거나 작다라고 쓰면 에러남...
			sum+=scores[i];									//sum=sum+scores[i]
		}
		avg=sum/scores.length;
		System.out.println("반 총점 : "+sum);
		System.out.println("반 평균 : "+avg);
	}

}
