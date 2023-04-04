package ch01.verify;

public class CarEx01 {

	public static void main(String[] args) {
		Car myCar=new Car("소나타", "파란색");
		myCar.speed=30;
		myCar.speedChange(300);
		carRun(myCar);
		myCar.stop();
		carRun(myCar);
		
		Car gilCar=new Car("그랜져", "흰색",280);
		gilCar.speedChange(300);
		carRun(gilCar);
		gilCar.stop();
		carRun(gilCar);
	}
	
	public static void carRun(Car obj) {										//클래스 객체 헷갈리지 말것
		if(obj.speed!=0) {
			System.out.println(obj.name+"를 타고 "+obj.speed+"km로 달립니다.");
		}
		else {
			System.out.println(obj.name+"를 정지합니다.");
		}
	}
}
