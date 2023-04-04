package javapro.API;

public class BoxingEx01 {

	public static void main(String[] args) {
		
		int num1=10;
		System.out.println(num1);
		
		//박싱(Boxing)
		Integer obj2=10;								//10이 들어가있는게 아니라 번지를 보관 -> boxing : 실제 값을 보관하는게 아니라 번지를 기억하는 것
		System.out.println(obj2.intValue()); 			//실제 값을 불러오는 메소드
		
		//언박싱(unBoxing)
		int value=obj2;									//자동적으로 num2에 있는 번지수를 찾아가서 그 값을 넣어준다
		System.out.println(value);						
		
		int result=obj2+30;								
		System.out.println("결과값 = "+result);
		
		int num2=50;
		int num3=50;
		if(num2==num3) {
			System.out.println("같은 값입니다.");			//둘이 같은 값
		}
		else {
			System.out.println("다른 값입니다.");
		}
		
		Integer num4=50;
		Integer num5=50;
		if(num4==num5) {
			System.out.println("같은 값입니다.");			//둘이 같은 번지를 가리킴(엄밀히 따지면 같은 값을 갖는게 아님)
		}
		else {
			System.out.println("다른 값입니다.");
		}
		
		
	}

}
