package javapro.classEx2;

public class AEx01 {

	public static void main(String[] args) {
		
		A a=new A();			//A 인스턴스 객체 생성
		a.fieldA1=20;
		A.B b=a.new B();		//A 객체를 먼저 생성해야 B 인스턴스 객체를 생성할 수 있다
		
	}

}
