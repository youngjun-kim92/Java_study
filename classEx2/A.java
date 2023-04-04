package javapro.classEx2;

public class A {
	
	//인스턴스 필드
	int fieldA1;
	static int fieldA2;
	
	//생성자
	public A() {
		System.out.println("클래스 A의 생성자");
	}
	
	//인스턴스 내부 클래스
	class B {											//A를 써야 B를 쓸수있다. B만 단독으로 못씀
		
		int fieldB1=20;
		
		public B() {
			System.out.println("내부 클래스 B의 생성자");
		}
		
		void methodB1() {
			System.out.println("내부 클래스 B의 메소드");
			fieldA1=10;									//내부클래스는 바깥쪽 클래스의 필드, 메소드에 접근가능
			methodA1(); 								
			fieldA2=20;
			methodA2();
		}
		
	}
	
	//정적 내부 클래스(A의 정적필드와 메소드는 접근 가능하나 인스턴스필드, 메소드는 접근 불가) : static class는 내부에서만 선언할 수 있으며 굳이 쓰는 이유는 상위 클래스의 객체를 생성하지 않고 쓰기위해서이다. 
	static class C {
		
		int fieldC1=30;
		
		void methodC1() {
			fieldA2=30;
			methodA2();									//methodA1();, fieldA1 안됨
			
		}
	}
	
	
	//메소드
	void methodA1() {
		System.out.println("클래스 A의 메소드");
		B b=new B();
		b.methodB1();
	}
	
	static void methodA2() {
		System.out.println("클래스 A의 정적메소드");
	}
	

}
