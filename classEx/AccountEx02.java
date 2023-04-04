package javapro.classEx;

public class AccountEx02 {

	public static void main(String[] args) {
		
		Account younghee=new Account("111-77-66666", "이영희", 1000);	 	//객체변수 생성(매개변수를 받으면서 만든 객체)
		Account chanho=new Account("111-33-99999", "박찬호", 0);
		
		younghee.deposit(6000);
		chanho.deposit(10000);
		
		try{
			younghee.withdraw(2000);
			printAccount(younghee);										//obj에 younghee값이 받아짐 											
			printAccount(chanho);
			printAccount(new Account("123-45-77777","손흥민",3000));	 	//익명개체 생성	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//예금정보 출력 메소드
	public static void printAccount(Account obj) {					 	//printAcoount : 메소드이름 / Account : 타입 or 클래스(영희가 클래스를 받은 객체변수이므로 그 객체가 하는 메소드 역시 똑같아야함)
		System.out.println("은행 : "+Account.BANKNAME);					//<--정적필드에서 생성됐기 때문에 객체필드로 할 필요가 없다.
		System.out.println("계좌번호 : "+obj.accountNo);					//obj : 외부정보를 받을 매개변수
		System.out.println("예금주이름 : "+obj.ownerName);					//static은 클래스처럼 사용가능
		System.out.println("잔액 : "+obj.balance);
		System.out.println("-------------------------");
	}

}
