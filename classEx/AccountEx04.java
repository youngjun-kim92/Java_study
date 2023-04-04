package javapro.classEx;

public class AccountEx04 {

	public static void main(String[] args) {
		
		Account chulsu=new Account("111-22-55555", "김철수",0);						//모든 객체들은 초기값이 존재한다.
		Account gildong=new Account();
		printAccount(chulsu);
		printAccount(gildong);
	}
	
	public static void printAccount(Account obj) {					 	
		System.out.println("은행 : "+Account.BANKNAME);					
		System.out.println("계좌번호 : "+obj.accountNo);					
		System.out.println("예금주이름 : "+obj.ownerName);
		System.out.println("잔액 : "+obj.balance);
		System.out.println("-------------------------");
	}
}
