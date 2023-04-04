package ch01.verify;

public class Car {
	
	//필드
	String name; 			//자동차 이름
	String color;			//자동차 색상
	int speed;				//자동차 속도
	int maxSpeed=250;		//자동차 최대속도
	
	
	//생성자
	public Car() {
	}
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Car(String name, String color, int maxSpeed) {
		this.name = name;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	//메소드
	void speedChange(int speed) {
		if(speed>maxSpeed) {
			this.speed=maxSpeed;
		}
		else {
			this.speed=speed;
		}
	}
	
	void stop() {
		speed=0;
	}

}
