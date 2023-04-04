package javapro.reference;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		int[] oldNums= {10,51,23};									
		int[] newNums=new int[5];
		
		//newNums=oldNums;										//이렇게 하면 배열이 복사가 된것이 아닌 번지가 복사되어 같은 값을 나타내게 된 것(기존에 있던 newNums의 값은 쓰레기값이 되어버림)
		
		for(int i=0;i<oldNums.length;i++) {						//배열값을 복사하려면 for문을 이욯하여 직접 값을 넣어줘야한다. 혹은 뒤에 배운 System.arraycopy쓰기
			System.out.print(oldNums[i]+" ");
			newNums[i]=oldNums[i];
		}
		
		System.out.println();
		
		for(int i=0;i<newNums.length;i++) {
			System.out.print(newNums[i]+" ");
		}
	}

}
