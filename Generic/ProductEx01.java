package javapro.Generic;

public class ProductEx01 {

	public static void main(String[] args) {
		
		Product<Tv, String> product1=new Product<>();		//뒤에는 생략가능
		product1.setKind(new Tv());
		product1.setModel("스마트 TV");
		Tv tv=product1.getKind();
		String tvModel=product1.getModel();
		Product<Car, String> product2=new Product<>();
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		Car car=product2.getKind();
		String carModel=product2.getModel();

	}

}
