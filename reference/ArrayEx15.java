package javapro.reference;

public class ArrayEx15 {

	
	//연습문제 8
	public static void main(String[] args) {
		
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum=0;
		int count=0;
		double avg;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				count++;
				sum+=array[i][j];
			}
		}
		avg=(double)sum/count;
		System.out.println("전체 합 = "+sum);
		System.out.println("전체 평균 = "+avg);
		
	}

}
