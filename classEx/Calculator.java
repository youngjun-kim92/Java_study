package javapro.classEx;

public class Calculator {
	
	//메소드(ex01)
	/*int add(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}
	
	int add(int num1, int num2, int num3) {				//숫자 매개변수가 늘어나는 것을 해결할 수 없다....ㅜ
		int sum=num1+num2+num3;
		return sum;
	}*/
	
	int add(int ... nums) {								//<--숫자가 늘어나면 일일히 입력할 수 없기때문에 가변길이 메소드를 통해 해결
		int sum=0;										//...을 넣어주면 알아서 배열로 받아준다!!
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		return sum;
	}
	
	

}
