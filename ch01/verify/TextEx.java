package ch01.verify;

public class TextEx {

	public static void main(String[] args) {
	
		GoodsInfo g=new GoodsInfo("sd", "sdw", "sddd", 3000);
		g.updateDiscountRate(10);
		System.out.println(g.getSellingPrice());
		
	}

}
