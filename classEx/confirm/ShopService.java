package javapro.classEx.confirm;

public class ShopService {

	private static ShopService shop=new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {						//싱글톤 객체 사용법 잘 알아둘것!!
		return shop;
	}
}
