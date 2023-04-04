package javapro.classEx;

//마이너스통장 클래스
public class CreditLineAccount extends Account{

	//필드
	int creditLine;																						//마이너스 한도
	
	//생성자
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, creditLine);
		this.creditLine=creditLine;
	}
	
	public CreditLineAccount() {
		
	}
	
	//메소드
	@Override																							//@으로 작성하는것을 annotation이라한다. 컴파일 했을 때 에러났는지 안났는지 알려줌
	int withdraw(int amount) throws Exception{															//메소드 오버라이딩 : 메소드를 재정의해줘서 적용시킴(부모 메소드가 적합하지 않을시 자식 클래스에서 새롭게 정의되어 사용하므로 정말 많이 쓰임)
		if((balance+creditLine)<amount) {
			throw new Exception("인출이 불가능합니다.");
		}
		balance-=amount;
		return amount;
	}
	
	
	
}
