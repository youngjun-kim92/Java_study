package javapro.classEx;

public class CheckingAccountEx01 {

	public static void main(String[] args) {
		
		CheckingAccount chulsu=new CheckingAccount("111-22-55555", "김철수", 10, "1111-2222-3333-4444");
		chulsu.deposit(5000);
		try{
			int paidAmount=chulsu.pay("1111-2222-3333-4444", 2000);
			System.out.println("지불액 : "+paidAmount);
			System.out.println("잔액 : "+chulsu.balance);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
