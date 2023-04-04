package javapro.classEx;

public class Cheomseongdae {
	
	private static Cheomseongdae cheom=new Cheomseongdae();				//singleton생성
	
	private Cheomseongdae() {
	}
	
	public static Cheomseongdae getInstatnce() {
		return cheom;
	}
	
	public static void show(String name) {
		System.out.println(name+"이(가) 천문을 관측합니다.");
		
	}
}
