package ch01.verify;

public class TaxiEx01 {

	public static void main(String[] args) {
		
		Taxi callTaxi=new Taxi(3000, 100);
		callTaxi.speedChange(60);
		int account=callTaxi.accounts();
		System.out.println("택시 요금은 "+ account+"로 정산되었습니다.");
		
		Taxi callTaxi2=new Taxi(3000, 100);
		callTaxi2.setFare(true);
		callTaxi2.speedChange(120);
		account=callTaxi2.accounts();
		System.out.println("택시 요금은 "+ account+"로 정산되었습니다.");
	}

}
