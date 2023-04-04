package javapro.interfaceEx;

public class Cat implements iAnimal{			//인터페이스를 쓰려면 implements로 "구현"한다라고 씀 --> 클래스 implements 인터페이스

	@Override
	public void eat() {
		System.out.println("생선을 좋아합니다.");
	}			
	

}
