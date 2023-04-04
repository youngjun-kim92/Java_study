package javapro.classEx;

//신한은행 계좌 클래스

public class Account {
	
	//필드
	
	//final String bankName="신한은행";										//은행 --> final은 변수에 값을 딱 한번만 넣어주고 그 다음부터는 절대 바꿀 수 없다. 변수 사용하는데는 아무문제 없음
	static final String BANKNAME="신한은행";									//static을 붙이면 정적필드(객체를 생성하지 않더라고 쓸수 있는 필드): 객체가 접근할수 있음 / static final(상수 만드는 명령어) --> 상수값은 변하지 않으므로 무조건 전부 대문자!!
	String accountNo;														//계좌번호(인스턴스필드 : 인스턴스 객체를 생성해야지만 접근하는 필드는 인스턴스 필드)
	String ownerName;														//예금주이름
	int balance;															//잔액
	
	//생성자(객체 초기화)
	public Account(String accountNo,String ownerName, int balance) {		//빈칸에 컨트롤+스페이스 누르고 constructor가 생성자를 만들며 이름은 클래스 이름과 동일
		/*accountNo=accNo;													//accNo, oName, bal은 외부로부터 값을 받는 매개변수
		ownerName=oName;													//클래스 안에 public을 붙이면 다른 package에서도 import를 통해 조건 없이 쓸 수 있다. | protected는 다른 package에서 부모로부터 상속받은 경우에만 쓸 수 있다.	
		balance=bal;*/
		this(accountNo,ownerName);											//this()안에 넣으면 다른생성자를 호출해서 동일한 이름 생성자에 넘겨준다.
		this.balance=balance;												//혹시 필드에 있는 변수이름과 매개변수 이름이 같을경우 this.을 붙여서 구분(this.이 붙은게 필드에 있는 변수이름)
	}																		//this.변수이름 : 객체인스턴스 | 그냥 변수이름 : 매개변수 --> 둘이 구분 잘해서 써야됨 특히 if문 같은데서!!
	
	public Account(String accountNo,String ownerName) {			
		
		this.accountNo=accountNo;											//this(accountNo,ownerName)이 여기서 작동
		this.ownerName=ownerName;
		
	}
	
	public Account() {														//매개변수가 없는 생성자는 default 생성자 --> 만약 클래스를 만들때 생성자를 안만들었다면 저절로 default 생성자를 생성
																			//따라서 객체를 만들 수 있게 해줌 (개발자가 생성자를 만들었다면 default 생성자 안만듬)
	}																		//만약 내가 객체를 만들때 따로 매개변수없이 만들고싶다면 default 생성자를 따로 만들어야 에러가 안남 (ex01, ex02 비교)
	
	//메소드(소문자로 작성)
	void deposit(int amount) {												//예금한다
		balance+=amount;													//메소드 이름 앞에 void가 있으면 리턴값이 없음
	}
	
	int withdraw(int amount) throws Exception {								//인출한다(메소드 이름 앞에 타입이 있으면 리턴이 반드시 필요함)
		if(balance<amount) {												//throws Exception -> 예외발생 -> 새로운 Exception을 생성해서 해당 문구를 보냄 	
			throw new Exception("잔액이 부족합니다.");							//해당 메소드를 사용하는 모든 클래스에 try~catch적용해야함
		}
		balance-=amount;													//예외가 발생하면 밑에 명령문은 수행안함
		return amount;
	}
}
