package javapro.interfaceEx;

public class RemoteControlEx01 {

	public static void main(String[] args) {
		
		RemoteControl rc;									//인터페이스도 하나의 타입으로 간주되므로 변수타입으로 사용가능
		Searchable sa;										//다중 인터페이스를 구현하려면 메인메소드에서 인터페이스 구현객체 역시 전부 필요하다.
		
		rc=new Television();								//다형성
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc=new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBattery();
		rc.turnOff();
		System.out.println();
		
		
		rc=new SmartTelevision();
		rc.setVolume(5);
		sa=new SmartTelevision();
		sa.search("http://www.youtube.com");
		rc.turnOff();

	}

}
