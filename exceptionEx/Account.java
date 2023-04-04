package javapro.exceptionEx;

public class Account {
	
	int balance;
	
	//메소드
	void deposit(int amount) {
		balance+=amount;
	}
	
	int withdraw(int amount) throws InsufficientException {												//예외를 개발자가 직접만듬 <- try,catch문을 필수적으로 입력해야됨
		if(balance<amount) {
			throw new InsufficientException("잔액이 부족합니다.("+(amount-balance)+")원이 모자랍니다.");
		}
		balance-=amount;
		return amount;
	}
}
