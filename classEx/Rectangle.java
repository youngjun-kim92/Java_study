package javapro.classEx;

//사각형 클래스
public class Rectangle {
	
	//필드
	private int width, height;										//클래스에 private를 붙이면 캡슐화(접근제한자)가 되어 보이지 않는다. <-- 필드에 접근하지 못해서 값 수정이 불가능
	
	//생성자
	public Rectangle(int width, int height) throws Exception {
		if(width<=0||height<=0) {
			throw new Exception("너비와 높이는 양수여야 합니다.");
		}
		this.width=width;
		this.height=height;
	}
	
	//메소드
	int getArea() {													//getter 메소드(캡슐화된 필드값을 보여주게함)
		return width*height;
	}
	int getWidth() {
		return width;
	}
	int getHeight() {
		return height;
	}
	public void setWidth(int width) {								//setter 메소드(캡슐화된 필드값을 재정의해줌)  --> getter와 setter 모두 source에서 generate getter/setter누르면 저절로 생김
		if(width>0) {
			this.width=width;
		}
	}
	public void setHeight(int height) {
		if(height>0) {
			this.height=height;
		}
	}
	
}
