package javapro.classEx;

public class Singleton {

	private static Singleton singleton=new Singleton();			//클래스에서 이미 딱 하나만 객체를 만듬
	
	private Singleton() {
		
	}
	
	
	static Singleton getInstance() {
		return singleton;
	}
}
