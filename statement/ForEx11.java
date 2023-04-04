package javapro.statement;

public class ForEx11 {

	public static void main(String[] args) {
		
		int sum=0;
		int i;
		for(i=1;i<=100;i++) {
			sum+=i;						//sum=sum+i
			if(sum>=3500) {
				System.out.println("3500이 넘으려면 몇까지 더하면 될까요?>> "+i);
				break;														//break는 switch뿐만 아니라 반복문에서도 쓰일 수 있다.
			}
		}
		System.out.println((i-1)+"까지 더하면 "+(sum-i)+"이므로 "+i+"를 더하면 "+sum+"이 되어서 3500이 넘는다.");
	}
		
}

