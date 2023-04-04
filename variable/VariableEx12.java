package javapro.variable;

public class VariableEx12 {

	public static void main(String[] args) {
		//변수의 사용범위 : {}
		int num1=5;
		int num2=0;		//다음과 같이 if문을 쓰려면 num2에 초기값을 설정해줘야한다. (블럭안에 변수를 잘 보고 판단할것) 즉, if문 안의 내용을 if문 밖에서 쓸수 없다.
		if(num1>=20) {
			num2=30;
		}
		System.out.println(num1+num2);
		

	}

}
