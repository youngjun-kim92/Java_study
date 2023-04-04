package ch01.verify;

public class GoodsInfo {
	
	String code;
	String name;
	String marker;
	int price;
	int discountRate;
	
	public GoodsInfo(String code, String name, String marker, int price, int discountRate) {
		this.code = code;
		this.name = name;
		this.marker = marker;
		this.price = price;
		this.discountRate = discountRate;
	}

	public GoodsInfo(String code, String name, String marker, int price) {
		this.code = code;
		this.name = name;
		this.marker = marker;
		this.price = price;
	}
	
	void updateDiscountRate(int discountRate) {
		this.discountRate=discountRate;
	}
	
	int getSellingPrice() {
		int money=price-price*discountRate/100;
		return money;
	}
}
