package javapro.statement;

public class ForEx05 {

	public static void main(String[] args) {
		
		System.out.println("** 로또 자동 번호 생성 **");
		for(int i=1;i<=6;i++) {
			int num=(int)(Math.random()*45)+1;				//Math는 수학에 관련된 값을 구해준다. Math.random()는 0부터 1사이의 난수를 구해준다.
			System.out.println(num);				
		}
	}
}
