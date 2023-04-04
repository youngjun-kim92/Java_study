package javapro.API;

public class MemberEx01 {

	public static void main(String[] args) {
		
		Member obj1=new Member("blue");											//<- new로 생성했기 때문에 다른객체로 본다.
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 같은 ID입니다.");						//String이라는 클래스 안에는 equls라는 메소드가 있다 -> 내가 임의로 override해서 쓸수 있다.
		}
		else {
			System.out.println("obj1과 obj2는 다른 ID입니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 같은 ID입니다.");
		}
		else {
			System.out.println("obj1과 obj3는 다른 ID입니다.");
		}
		
	}

}
