package javapro.classEx;

public class CreditLineAccountEx01 {

	public static void main(String[] args) {
		CreditLineAccount sundal=new CreditLineAccount("111-44-88888", "김선달", 10, 1000000);
		try{
			int amount=sundal.withdraw(300000);
			System.out.println("인출액 : "+amount);
			System.out.println("잔액 : "+sundal.balance);
			System.out.println("마이너스 한도 : "+sundal.creditLine);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
