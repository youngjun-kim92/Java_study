package javapro.reference;

public class ArrayEx05 {

	public static void main(String[] args) {
		
		int[][] nums= {
				{96,85,90},
				{70,86,66,82,75}
				};
		System.out.println(nums.length); 				//nums.length는 행에 지정된 번지수의 갯수
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
