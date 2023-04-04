package javapro.reference;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		int[] nums= {45,17,3,78,50};
		int temp;
		
		//소트 전															//정렬(sort) : 무질서한 자료를 원하는 순서대로 재배열하는 것
		System.out.println("** 소트 전 출력 **");							//오름차순 정렬(Ascending sort) : 작은 것 --> 큰 것
		for(int i=0;i<nums.length;i++) {								//내림차순 정렬(Descending sort) : 큰 것 --> 작은 것
			System.out.print(nums[i]+"  ");
		}
		System.out.println();
		
		//소트 알고리즘														//해당 알고리즘은 오름차순 소트에서 일반적으로 쓰이는 알고리즘이므로 외울 것!!
		for(int a=0; a<nums.length-1;a++) {								
			for(int b=a+1;b<nums.length;b++) {
				if(nums[a]>nums[b]) {									//내림차순은 if문 안의 부등호만 반대로 바꾸면됨
					temp=nums[a];
					nums[a]=nums[b];
					nums[b]=temp;
				}
			}
		}
		
		//소트 후
		System.out.println("** 소트 후 출력 **");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+"  ");
		}
		System.out.println();
	}

}
