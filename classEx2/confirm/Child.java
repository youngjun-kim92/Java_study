package javapro.classEx2.confirm;

public class Child extends Parent {
	
	//필드
	public String name;
	
	//생성자
	//3
	public Child() {
		//super() <--숨겨져있는 꼴임
		this("홍길동");
		System.out.println("Child() call");
	}
	//4
	public Child(String name) {
		this.name=name;
		System.out.println("Child(String name) call");
	}

}
