package javapro.variable;

public class VariableEx10 {

	public static void main(String[] args) {
		byte num1=10+20;
		System.out.println(num1);
		int value=1+2+3;
		System.out.println(value);
		int value1=1+2+3;
		System.out.println(value1);
		
		String str1=1+2+"3";
		System.out.println(str1);	//3+"3" --> "33"
		String str2=1+"2"+3;
		System.out.println(str2);	//"12"+3 --> "123"
		String str3="1"+2+3;
		System.out.println(str3);	//"12"+3 --> "123"

	}

}
