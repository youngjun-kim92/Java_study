package javapro.interfaceEx;

public class Tiger extends Animal implements iAnimal {				//클래스는 다중상속은 안되지만 인터페이스를 통해 다중상속처럼 쓸수 있다

	@Override
	public void eat() {
		System.out.println("멧돼지를 잡아먹습니다.");
	}

	@Override
	public void move() {
		System.out.println("네발로 이동합니다.");
	}				
	
}


