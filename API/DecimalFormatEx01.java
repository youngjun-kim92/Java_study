package javapro.API;

import java.text.DecimalFormat;

public class DecimalFormatEx01 {

	public static void main(String[] args) {
		
		int price=1560000;
		DecimalFormat df;
		df=new DecimalFormat("#,###");						//앞에 3자리에 , 찍어준다는 의미
		System.out.println("판매금액 = "+df.format(price));
		
		double num=74521.3122;
		df=new DecimalFormat("#,###.##");					//#은 소수점 이하 두자리까지만 출력하고 남은건 무시
		System.out.println(df.format(num)); 					
		
		double num2=74521.3;
		df=new DecimalFormat("#,###.00");					//0운 소수점 이하 두자리까지만 출력하고 남은건 0으로 채워놓음
		System.out.println(df.format(num2));

	}

}
