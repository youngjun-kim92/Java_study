package ch01.verify;

public class Taxi extends Car {
	
	
	public Taxi() {
		super();
		
	}

	int baseCharge; 						//택시 기본 요금
	int charge;								//속도당 요금
	boolean fare;							//할증 여부(true, false)
	static final String COMPANY="우리운수";	//택시 회사 이름
	
	
	public Taxi(int baseCharge, int charge) {
		this.baseCharge = baseCharge;
		this.charge = charge;
	}

	void setFare(boolean fare) {
		this.fare=fare;
	}
	
	int accounts() {
		int money;
		if(fare) {
			money=(int)(baseCharge+speed*1.5*charge);
		}
		else {
			money=baseCharge+speed*charge;
		}
		return money;
	}
}
