package javapro.classEx2.confirm;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child=new Child();					//매개변수가 없으면 매개변수 없는 생성자를 호출
													//default 생성자를 통해 자식객체를 생성할때 먼저 부모 생성자를 통해 객체를 호출하고 그다음 자식 생성자를 통해 객체생성(super 명령어가 숨겨져있는 꼴임)
													//출력 순서를 자세히 이해할것!!!(매우중요)
													//먼저 Parent클래스의 1번생성자가 호출되고 this("대한민국")의 대한민국이 2번생성자 nation매개변수에 전달 -> nation필드에 저장시키고 난후에 같은 방법으로 Child클래스의 생성자가 호출되므로 
													//순서대로 2-1-4-3
		
		
	}												

}
