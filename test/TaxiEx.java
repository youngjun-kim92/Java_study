package javapro.test;

public class TaxiEx {

	public static void main(String[] args) {
		Taxi taxi=new Taxi("서울택시");
		taxi.setFare(true);
		taxi.speed=2;
		taxi.accounts();
		showInfo(taxi);
		
	}
	
	public static void showInfo(Taxi obj) {
		System.out.println("택시회사 이름 : "+obj.company+"\n요금 : "+obj.charge+"\n할증여부 : "+obj.fare);
	}

}
