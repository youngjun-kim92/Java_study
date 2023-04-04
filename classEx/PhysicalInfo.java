package javapro.classEx;

//신체 정보 클래스 <-- 보통은 필드, 생성자, 메소드를 다 만들지만 특별한 경우 하나만 만들수도 있다.
public class PhysicalInfo {
	
	//필드
	private String name;
	int age;
	float height,weight;
	
	//생성자
	public PhysicalInfo(String name, int age, float height, float weight) {
		
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		
	}
	
	//메소드
	void update(int age, float height, float weight) {
		
		this.age=age;
		this.height=height;
		this.weight=weight;
		
	}
	void update(int age, float height) {										//메소드 오버로딩 : 똑같은 이름을 가진 메소드를 여러개 만드는것 
																				//--> 에러가 발생하지 않으려면 매개변수 타입이 다르거나 개수가 달라야한다. 즉, 하나라도 다른것이 있어야함		
		this.age=age;
		this.height=height;
		
	}
	void update(int age) {
		
		this.age=age;
		
	}
	String getName() {
		return name;
	}
	
}
