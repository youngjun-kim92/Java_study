package javapro.classEx;

public class DokdoAccountEx01 {

	public static void main(String[] args) {
		DokdoAccount chulsu=new DokdoAccount("111-222-55555", "김철수", 0, 0);
		
		chulsu.deposit(50000);
		System.out.println("잔액 : "+chulsu.balance);
		System.out.println("포인트 : "+chulsu.point);
		
		chulsu.deposit(20000);
		System.out.println("잔액 : "+chulsu.balance);
		System.out.println("포인트 : "+chulsu.point);
	}

}
