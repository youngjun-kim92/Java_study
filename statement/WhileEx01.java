package javapro.statement;

public class WhileEx01 {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(i<=100) {												//while은 for문과는 달리 while(조건식)만 쓰기 때문에 주의할것!!
			sum+=i;
			i++;
		}
		System.out.println("1부터 100까지의 합 = "+sum);
	}

}
