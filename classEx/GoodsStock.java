package javapro.classEx;

public class GoodsStock {
	
	//필드
	String goodsCode;
	int stockNum;
	
	//메소드
	void addStock(int amount) {
		stockNum+=amount;
	}
	
	int substractStock(int amount) {
		if(stockNum<amount) {
			return 0;
		}
		stockNum-=amount;
		return amount;
	}

}
