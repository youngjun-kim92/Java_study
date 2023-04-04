package javapro.interfaceEx;

public interface RemoteControl {
	
	//상수
	int MIN_VOLUME=0;								//인터페이스는 필드를 가질 수 없지만 상수를 가질 수 있으며 어차피 만들어진건 모두 상수취급하므로 static final을 붙일 필요없이 저절로 컴파일과정에서 생성
	int MAX_VOLUME=10;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);						//매개변수는 받을 수 있다.
	
	//디폴트 메소드
	default void setMute(boolean mute) {			//추상메소드와 달리 디폴트 메소드는 실행부가 있고 선언방법도 클래스메소드와 동일하나 default가 앞에 붙어야한다.
		if(mute) {									//추상메소드는 오버라이딩이 필수이지만 디폴트메소드는 굳이 오버라이딩할 필요가 없다. 단, 필요하면 오버라이딩 할 수 있다.
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제합니다.");		//무음을 헤제해도 볼륨이 0이라는 문제점이 있다..해결방안은 Audio에서
		}
	}
	
	
	//정적 메소드										//정적메소드 역시 객체,필드가 필요없이 선언할 수 있으므로 인터페이스 역시 가능하다. static을 앞에 붙이면 되고 public은 생략가능
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
	
	
}
