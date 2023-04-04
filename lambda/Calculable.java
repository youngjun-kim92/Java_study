package javapro.lambda;

@FunctionalInterface					//람다식으로 추상메소드 하나만 만들겠다고 선언하는 annotation
public interface Calculable {
	
	void calculate(int x, int y);
	

}
