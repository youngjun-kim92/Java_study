package javapro.classEx;

public class CheomseongdaeEx01 {

	public static void main(String[] args) {
		
		Cheomseongdae cheom1=Cheomseongdae.getInstatnce();
		Cheomseongdae cheom2=Cheomseongdae.getInstatnce();
		
		cheom1.show("철수");
		cheom2.show("길동");
		
		if(cheom1==cheom2) {
			System.out.println("같은 객체(첨성대)입니다.");				
		}
		else {
			System.out.println("다른 객체(첨성대)입니다.");
		}
		
	}

}
