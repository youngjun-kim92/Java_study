package javapro.reference;

public class ArrayEx17 {

	
	//연습문제 7
	public static void main(String[] args) {
		
		int[] array= {1,5,3,8,2};
		int max=0;
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("최댓값 = "+max);
	}

}
