package javapro.reference;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		int[] nums= {23,89,45,361,15,90,74};
		int sum=0;
		for(int num:nums) {								//for(타입 변수:배열명){....} --> 향상된 for문(배열에 특화된 for문으로 배열이 없으면 쓸 수 없다.)
			sum+=num;									//여기서 변수는 임시값이나 다름없으며 배열에 처음값부터 차례대로 받는다. 배열 끝까지 다 돌면 for문을 빠져나옴
		}
		System.out.println("총합 = "+ sum);				
	}

}
