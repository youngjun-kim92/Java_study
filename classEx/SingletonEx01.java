package javapro.classEx;

public class SingletonEx01 {

	public static void main(String[] args) {
		
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();					
		
		if(obj1==obj2) {
			System.out.println("같은 Singletone 객체입니다.");				//Singleton객체는 오직 하나만 생성되므로 변수 이름은 다르지만 항상 같은 객체
		}
		else {
			System.out.println("다른 Singletone 객체입니다.");
		}
	}

}
