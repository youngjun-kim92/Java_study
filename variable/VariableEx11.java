package javapro.variable;

public class VariableEx11 {

	public static void main(String[] args) {
		String str1="10";
		String str2="20";
		System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));		//Integer.parseInt() <--객체 안에 있는 숫자형 문자를 분석해서 정수화 시켜줌
		
		String str3=String.valueOf(10);
		String str4=String.valueOf(3.14);
		System.out.println(str3+str4);

	}

}
