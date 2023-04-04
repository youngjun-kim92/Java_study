package javapro.classEx2;

//중첩 인터페이스
public class Button {

	interface ClickListner {										//클래스 안에 만들어진 인터페이스를 중첩 인터페이스라 한다.
		void onClick();
	}
	
	//필드
	private ClickListner clickListner;

	public void setClickListner(ClickListner clickListner) {
		this.clickListner = clickListner;
	}
	
	public void click() {
		this.clickListner.onClick();
	}
	
}
