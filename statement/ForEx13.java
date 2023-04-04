package javapro.statement;

public class ForEx13 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				continue;						//continue를 만나면 밑으로 못내려가고 다시 for문 처음으로 간다.
			}
			sum+=i;
		}
		System.out.println("1부터 100까지의 합(5의 배수는 제외) = "+sum);
	}
		
}

