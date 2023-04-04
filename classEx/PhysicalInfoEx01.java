package javapro.classEx;

public class PhysicalInfoEx01 {

	public static void main(String[] args) {
		
		PhysicalInfo younghee=new PhysicalInfo("이영희", 10, 130.5f, 35.0f);
		printPhysicalInfo(younghee);
		
		younghee.update(11, 145.4f, 48.2f);
		printPhysicalInfo(younghee);
		
		younghee.update(12, 152.0f);											//메소드 오버로딩을 통해 만든 메소드로 에러가 안나는것
		printPhysicalInfo(younghee);
		
		younghee.update(13);
		printPhysicalInfo(younghee);
	}
	
	//신체정보 출력 메소드
	public static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름 : "+obj.getName());
		System.out.println("나이 : "+obj.age);
		System.out.println("키 : "+obj.height);
		System.out.println("몸무게 : "+obj.weight);
		System.out.println("-----------------------");
	}

}
