package ch01.verify;

public class Ex05 {

	public static void main(String[] args) {
		int count=0;
		int num;
		for(int i=1;i<=10000;i++) {
			num=(int)(Math.random()*100)+1;
			if(num==7) {
				count++;
			}
		}
		if(count>=100) {
			System.out.println("확률이 높음("+count+"4)");
		}
		else {
			System.out.println("확률이 낮음("+count+")");
		}
	}

}
