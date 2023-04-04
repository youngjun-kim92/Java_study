package javapro.classEx;

public class AccountEx03 {

	public static void main(String[] args) {
		
		Account gildong=new Account("111-22-88888", "홍길동", 10);
		gildong.deposit(5000);
		gildong.deposit(7000);
		try {															//클래스에 예외를 만들었으면 무조건 try~catch를 해야한다.
			int amount=gildong.withdraw(20000);
			System.out.println("인출금액 : "+amount);
		}
		catch (Exception e) {											//throw한 exception을 catch하며 e는 예외를 받는 매개변수
			System.out.println(e.getMessage());
		} 

	}

}
