package javapro.classEx;

public class AccountEx01 {

	public static void main(String[] args) {
		
		Account chulsu=new Account();											//chulsu란 이름의 인스턴스 객체 생성 <-- 매개변수 없이 만든 객체
		chulsu.accountNo="111-22-55555";										//객체에 .을 찍고 그냥 나오면 필드, ()가 같이 나오면 메소드
		chulsu.ownerName="김철수";												//인스턴스 객체를 생성해야지만 접근하는 필드는 인스턴스 필드
		chulsu.balance=100;

		Account gildong=new Account();
		gildong.accountNo="111-22-33333";			
		gildong.ownerName="홍길동";
		gildong.balance=0;
		
		chulsu.deposit(3000);
		chulsu.deposit(5000);
		gildong.deposit(10000);
		
		try{
			gildong.withdraw(2000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(chulsu.ownerName+"의 잔액 = "+chulsu.balance);
		System.out.println(gildong.ownerName+"의 잔액 = "+gildong.balance);
		
	}

}
