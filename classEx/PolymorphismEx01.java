package javapro.classEx;

//다형성
public class PolymorphismEx01 {

	public static void main(String[] args) {
		
		Account acc1=new Account();											//선언은 Account 객체생성도 Account
		Account acc2=new CheckingAccount();									//선언은 Account로 했는데 객체셍성은 CheckingAccount로 했으므로 선언이 우선시되므로 공통으로 있는 Account 메소드는 쓸수 있지만 CheckingAccount에만 있는 메소드 사용불가
		Account acc3=new CreditLineAccount();								//선언은 Account로 했는데 객체셍성은 CheckingAccount로 했으며 CreditLineAccount는 Account를 Override했으므로 재정의된 메소드가 호출
		
		CheckingAccount acc4=(CheckingAccount)acc2;							//강제 형변환(acc2는 checkingaccount 형태로 생성되었지만 선언은 Account로 되있으므로 강제 형변환을 시켜줘야된다) 
																			//즉, 부모는 자식꺼를 자동으로 쓸수 있지만 자식은 부모꺼를 쓰려면 강제 형변환 시켜줘야한다.

	}

}
