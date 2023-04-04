package javapro.test;

public class Taxi extends Car{
	int charge;
	boolean fare;
	String company;
	
	public Taxi(String company) {
		this.company = company;
	}
	
	public void accounts() {
		if(fare) {
			charge=speed*12;
		}
		else {
			charge=speed*10;
		}
	}
	
	public void setFare(boolean fare) {
		this.fare=fare;
	}
	
}
