package javapro.classEx2;

public class CarEx01 {

	public static void main(String[] args) {
		
		//필드 다형성
		Car myCar=new Car();			//myCar 인스턴스객체 생성
		
		myCar.tire=new Tire();
		myCar.run();
		
		myCar.tire=new HankookTire();
		myCar.run();
		
		myCar.tire=new KumhoTire();
		myCar.run();
		
	}

}
