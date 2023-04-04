package javapro.classEx;

public class Car {
	
	//필드
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	public Car(String model) {									//매개변수의 개수에 따라 받는 생성자가 각각 다름 <-- 1개일 때
		this(model,"은색",250);
	}
	
	public Car(String model, String color) {					//<--2개일 때
		this(model,color,250);
	}
	
	public Car(String model, String color, int maxSpeed) {		//<--3개일 때
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
	
}
