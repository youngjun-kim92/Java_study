package javapro.API;

public class ReflectionEx01 {

	public static void main(String[] args) {
		
		Class carInfo=Car.class;							//Car라는 클래스의 메타정보(객체정보)를 cafInfo에 넣은것
		System.out.println(carInfo.getPackageName());		//Car라는 클래스의 패키지이름
		System.out.println(carInfo.getSimpleName()); 		//클래스 이름을 가져옴
		System.out.println(carInfo.getName()); 				//패키지, 클래스이름을 전부 가져옴
		

	}

}
