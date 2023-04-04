package ch01.verify;

public class Ex02 {

	public static void main(String[] args) {
		
		int[]array= {124,153,145,231,162,195,203,135,129,128,206};
		int sum=0;
		int i;
		
		for(i=0;i<array.length;i++) {
			sum+=array[i];
			if(sum>=1000) {
				break;
			}
		}
		System.out.println(array[i]+"개 까지 더하면 "+sum+"이 되므로 1000을 초과하게 됩니다.");
	}

}
