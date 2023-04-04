package javapro.classEx2;

public class AEx02 {

	public static void main(String[] args) {
		
		A.C c=new A.C();			//정적클래스이므로 A라는 객체를 생성안해도 쓸 수 있다.
		c.fieldC1=20;
		c.methodC1();
		

	}

}
