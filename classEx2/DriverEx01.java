package javapro.classEx2;

public class DriverEx01 {

	public static void main(String[] args) {
		
		Driver chulsu=new Driver();
		
		Bus bus=new Bus();
		chulsu.drive(bus);
		
		Taxi taxi=new Taxi();
		chulsu.drive(taxi);
		
		Truck truck=new Truck();
		chulsu.drive(truck);

	}

}
