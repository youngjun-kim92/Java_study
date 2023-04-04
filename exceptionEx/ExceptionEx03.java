package javapro.exceptionEx;

public class ExceptionEx03 {

	public static void main(String[] args) {
		
		Account chulsu=new Account();
		chulsu.deposit(10000);
		System.out.println("잔액 : "+chulsu.balance);
		
		int amount;
		
		try {
			amount = chulsu.withdraw(15000);
			System.out.println("인출액 : "+amount);
			System.out.println("잔액 : "+chulsu.balance);
		} 
		catch (InsufficientException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
