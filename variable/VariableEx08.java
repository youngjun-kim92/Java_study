package javapro.variable;

public class VariableEx08 {

	public static void main(String[] args) {
		String str="철수는 학교에 갔다. \n수업중이다.";		// \는 특정 기능을 하는 용도로 쓰임  \" -->"를 출력해서 보여줌, \U(소문자임)16진수 아스키코드 --> 해당 값을 출력, \t --> tab키, \n --> 줄바꿈
		System.out.println(str);
		double dnum=5.3;
		int num=(int)dnum;		//강제타입변환 --> 캐스팅
		System.out.println(num);

	}

}
