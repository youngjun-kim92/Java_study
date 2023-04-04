package javapro.API;

public class SmartPhoneEx01 {

	public static void main(String[] args) {
		
		SmartPhone myPhone=new SmartPhone("삼성전자", "안드로이드");
		System.out.println(myPhone.toString());
		System.out.println(myPhone);           											//둘이 같은결과로 나오는데 이는 .toString()메소드가 생략되서 콘솔로 결과를 나타내주기 때문

	}

}
