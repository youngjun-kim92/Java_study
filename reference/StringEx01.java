package javapro.reference;

public class StringEx01 {

	public static void main(String[] args) {
		
		/*int num=300;
		String str="korea";
		str="seoul";					num, str은 stack영역에 저장, num에 저장되있는 300도 여기에 저장 -- String타입은 번지를 저장하고 '참조'형식으로 heap영역에 번지를 찾아가서 실제 그 값을 읽음 
										string값에 null 또는 다른값을 넣으면 번지가 바뀌므로 korea는 쓰레기 값이된다. 
		System.out.println(num);
		System.out.println(str);*/
		
		String str1="김철수";
		String str2="김철수";
		if(str1==str2) {
			System.out.println("str1과 str2는 참조(메모리번지)가 같습니다.");			//절대 ""안에 문자열은 ==와 같은 비교연산을 쓰지 말 것!! 
		}																		//why) 이미 동일한 문자가 찍혀있으므로 str1과 str2에는 같은 번지수가 지정되있는거뿐
		else {
			System.out.println("str1과 str2는 참조(메모리번지)가 다릅니다.");
		}
		
		String str3=new String("홍길동");											//new는 무조건 비어있는 번지수를 찾아서 거기에 값을 저장 ex)700번지에 홍길동 저장 + 800번지에 홍길동 저장
		String str4=new String("홍길동");
		if(str3==str4) {
			System.out.println("str3과 str4는 참조(메모리번지)가 같습니다.");			 
		}																		
		else {
			System.out.println("str3과 str4는 참조(메모리번지)가 다릅니다.");
		}
		
		if(str3.equals(str4)) {													//객체타입 문자열 비교는 다음과 같이 쓴다!!
			System.out.println("str3과 str4는 같은 문자열입니다.");
		}
		else {
			System.out.println("str3과 str4는 다른 문자열입니다.");
		}
	}
	
}
