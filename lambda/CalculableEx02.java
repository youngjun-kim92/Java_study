package javapro.lambda;

public class CalculableEx02 {

	public static void main(String[] args) {
		
		Calculable sum=new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("두 수의 합 = "+(x+y));
				
			}
		};
		
		Calculable subtract=new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("두 수의 차 = "+(x-y));
				
			}
		};
		
		sum.calculate(23, 13);
		subtract.calculate(23, 13);
	}

}
