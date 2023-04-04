package javapro.interfaceEx;

public class BusEx01 {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Bus();
		vehicle.run(); 								//클래스 다형성과 마찬가지로 선언은 Vehicle 생성은 Bus로 했으므로 메소드는 오버라이딩된 Bus메소드를 사용
		Bus bus=(Bus)vehicle;						//클래스 상속과 마찬가지로 인터페이스 역시 부모자식과 마찬가지이므로 먼저 vehicle객체를 선언하고 자식꺼 메소드를 쓰려면 강제로 캐스팅 후 사용
		bus.run();
		
	}

}
