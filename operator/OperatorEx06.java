package javapro.operator;

public class OperatorEx06 {

	public static void main(String[] args) {
		
		/*byte value=127;
		value++;
		System.out.println(value);
		value++;
		System.out.println(value);	--> 최대값에서 증가되므로 overflow가 되서 -128이 찍힌 후 하나씩 증가*/
		
		byte value=-128;
		value--;
		System.out.println(value);	//최솟값에서 감소하므로 underflow가 되서 127이 찍힌 후 하나씩 감소

	}

}
