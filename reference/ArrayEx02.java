package javapro.reference;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		/*int[] nums=new int[5]; 				//배열은 자동적으로 값이 0으로 초기화 되있어서 따로 변수초기화를 할 필요가 없다. -->double은 0.0 boolean은 false, String은 null로 채워져있음
		nums[0]=10;
		nums[3]=75;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}*/
		
		int[] nums= {78,23,45,96,12,36,23,75};
		int evenSums=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				evenSums+=nums[i];
			}
		}
		System.out.println("배열 중 짝수들의 합 = "+evenSums);
		
	}

}
