package javapro.classEx.confirm;

public class Account {
	
	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE=1000000;
	private int balance;

	public int getBalance() {					//getter와 setter는 source에서 그냥 만들자..
		return balance;							//private로 만들면 인스턴스 객체로 balance에 접근이 불가능하므로 쓰는것
	}

	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE&&balance<=MAX_BALANCE) {
			this.balance = balance;
		}
		
	}
	
	
}
