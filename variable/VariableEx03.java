package javapro.variable;

public class VariableEx03 {

	public static void main(String[] args) {
		int x=50;
		int y=30;
		int temp;
		
		temp=x;  		//sort알고리즘에 많이 쓰이는 변수 값 서로 바꾸기 --> 임시 변수를 하나 더 설정해야된다.
		x=y;
		y=temp;
		
		System.out.println("x의 값 : " +x);
		System.out.println("y의 값 : " +y);
		
	}

}
