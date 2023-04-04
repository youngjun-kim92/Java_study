package javapro.classEx2;

public abstract class Animal {													//abstract는 추상클래스를 뜻하는거로 class생성할때 abstract 체크하면됨
	
	String name;
	
	public abstract void move();												//추상 메소드 : 본체가 없음 --> 이 클래스를 상속받는 클래스가 오버라이딩해서 사용하는것
	
	
	
}
