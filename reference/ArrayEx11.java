package javapro.reference;

public class ArrayEx11 {

	public static void main(String[] args) {
		
		int[] oldNums= {10,51,23};									
		int[] newNums=new int[5];
		System.arraycopy(oldNums, 0, newNums, 0, oldNums.length); 		//System.arraycopy(기존배열, 시작위치, 새배열, 시작위치, 옮길개수)
		
		for(int i=0;i<newNums.length;i++) {
			System.out.print(newNums[i]+" ");
		}
	}

}
