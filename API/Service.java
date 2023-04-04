package javapro.API;

public class Service {

	//메소드
	
	@PrintAnnotation
	public void method1() {
		System.out.println("메소드1 실행");
	}
	
	@PrintAnnotation("#")
	public void method2() {
		System.out.println("메소드2 실행");
	}
	
	@PrintAnnotation(value="=",number=30)
	public void method3() {
		System.out.println("메소드3 실행");
	}
}
