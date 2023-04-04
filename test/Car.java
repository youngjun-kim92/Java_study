package javapro.test;

public class Car {
	
	int speed;
	String name;
	
	public Car() {
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public void speedUp() {
		speed+=1;
	}
	
	public void speedDown() {
		speed-=1;
	}
	
	public void stop() {
		speed=0;
	}
	
	public void display() {
		System.out.println("자동차 이름 : "+name+", 속도 : "+speed);
	}
	
}
