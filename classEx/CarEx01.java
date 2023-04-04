package javapro.classEx;

public class CarEx01 {

	public static void main(String[] args) {
		
		Car myCar=new Car("택시", "검정", 220);
		printCar(myCar);
		
		Car myCar2=new Car("자가용");
		printCar(myCar2);
		
		Car myCar3=new Car("자가용", "흰색");
		printCar(myCar3);
		
	}

	//출력메소드
	public static void printCar(Car obj) {
		System.out.println("차 모델 : "+obj.model);
		System.out.println("차 색상 : "+obj.color);
		System.out.println("최고 속력 : "+obj.maxSpeed);
		System.out.println("=======================");
	}
	
}
