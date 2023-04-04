package javapro.interfaceEx;

public interface iAnimal {		
	
	/*컨트롤러와 데이터베이스의 중간자역할을 하는것이 인터페이스
	규칙) 
	1. 인터페이스는 필드를 가질 수 없다(중요) --> 중간접점역할만 하므로 필드는 필요없지만 static final(상수)는 가질수 있다.
	2. 기본적으로 추상메소드를 가진다.*/
	
	void eat();			//인터페이스는 굳이 클래스처럼 추상메소드를 만들때 abstract를 붙일 필요없이 알아서 추상메소드로 인식
	
	
}
