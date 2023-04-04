package javapro.reference;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[] scores= {78,96,85,66,82,79,90};
		String[] names= {"홍길동","박찬호","이영희","이동국","손흥민","이영표","박상원"};
		
		System.out.println("** 합격자 명단 **");
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>=80) {
				System.out.println("이름 : "+names[i]);
			}
		}
		
	}

}
