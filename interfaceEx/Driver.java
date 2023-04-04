package javapro.interfaceEx;

public class Driver {
	
	//메소드
	void drive(Vehicle vehicle) {					//매개변수로 vehicle를 받는다.
		
		vehicle.run();
		
		if(vehicle instanceof Bus) {				//매개변수가 Bus로 날라오는지 Taxi로 날라오는지 확인하는 작업
			Bus bus=(Bus)vehicle;					//Vehicle에는 checkFare 메소드가 없기때문에 강제로 타입을 변경해서 checkFare메소드를 실행시킬수 있게해줌
			bus.checkFare();
		}
		
		/*if(vehicle instanceof Bus bus) {			//자바12버전 이상부터 사용가능 --> 자동으로 Bus로 캐스팅해줌
			bus.checkFare();
		}*/
		
		if(vehicle instanceof Truck) {
			Truck truck=(Truck)vehicle;
			truck.loadUp();
		}
	}
	
}
