package javapro.Generic;

public class GenericEx02 {

	public static void main(String[] args) {
		
		Box1 box1=new Box1();						//box1 인스턴스 객체
		box1.content="안녕하세요";
		System.out.println(box1.content);
		
		Box2<String> mybox=new Box2<String>();		//mybox라는 인스턴스 객체를 생성하고 타입을 String
		mybox.content="우리모두파이팅";
		System.out.println(mybox.content);
		
		Box2<Integer> ubox=new Box2<Integer>();		//타입을 Integer로 인스턴스 객체생성
		ubox.content=100;
		System.out.println(ubox.content);

	}

}
