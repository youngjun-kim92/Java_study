package javapro.reference;

public class ArrayEx09 {

	public static void main(String[] args) {
		
		int[][] scores= {
				{96,85,90,60},									//항상 변수가 바껴도 적용되게끔 알고리즘을 짤 것
				{70,86,66,82,75},
				{60,90,75,74}
				};
		
		int sum;
		double avg;
		
		for(int i=0;i<scores.length;i++) {
			sum=0;
			for(int j=0;j<scores[i].length;j++) {
				sum+=scores[i][j];
				}
			avg=(double)sum/scores[i].length;
			System.out.println((i+1)+"반 성적 총점 = "+sum);
			System.out.println((i+1)+"반 성적 평균 = "+avg);
			}
		
		
	}

}
