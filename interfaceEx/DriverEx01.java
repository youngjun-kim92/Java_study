package javapro.interfaceEx;

public class DriverEx01 {

	public static void main(String[] args) {
		
		Driver chulsu=new Driver();
		Bus bus=new Bus();										//bus는 Bus로 선언되서 객체생성되고 Bus클래스는 Vehicle 인터페이스의 자식클래스이므로 자동적으로 Vehicle도 되는것
		chulsu.drive(bus);										//매개변수가 Vehicle로 선언되었지만 사용될수 있는이유
		
		
		Driver gildong=new Driver();
		Taxi taxi=new Taxi();
		gildong.drive(taxi);
		
		Driver younghee=new Driver();
		Truck truck=new Truck();
		younghee.drive(truck);

	}

}
