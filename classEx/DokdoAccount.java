package javapro.classEx;

//독도사랑 은행계좌 클래스
public class DokdoAccount extends Account{
	
	//필드
	int point;
	
	//생성자
	public DokdoAccount(String accountNo, String ownerName, int balance, int point) {
		super(accountNo, ownerName, balance);
		this.point=point;
	}

	//메소드
	@Override
	void deposit(int amount) {
		super.deposit(amount);						//부모 메소드 호출하는방법 : super.부모메소드
		point+=(amount*0.001);						//복합연산자는 자동으로 정수형으로 자동캐스팅이 된다.
	}
	
	
	
	

}
