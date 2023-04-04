package javapro.classEx;

//체크카드 클래스
public class CheckingAccount extends Account {														//클래스 상속받으려면 자식클래스명 옆에 extends 부모클래스
	
	//필드
	String cardNo;																					//카드번호
	
	//생성자
	public CheckingAccount(String accountNo,String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);														//부모 클래스로부터 생성자를 호출받을때는 super
		this.cardNo=cardNo;
	}
	
	public CheckingAccount() {
		
	}
	
	//메소드
	int pay(String cardNo, int amount) throws Exception {
		if(!this.cardNo.equals(cardNo)||balance<amount) {
			throw new Exception("지불이 불가능합니다");
		}
		else {
			return withdraw(amount);
		}
	}

}
