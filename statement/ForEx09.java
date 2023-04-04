package javapro.statement;

public class ForEx09 {

	public static void main(String[] args) {
		
		/*문제) 식당(족 전문집) - 돼지족, 오리족
		 직영농장 : 돼지, 오리 
		 
		 족은 자루에 담아서 식당으로 가져오고 몸통은 납품업체 전달해주고 영수증 가져오기
		 
		 자루(56족)
		 영수증 : 총 17마리 .....원*/
		
		int sum;
		
		for(int p=1;p<17;p++) {
			for(int d=1;d<17;d++) {
				sum=p*4+d*2;
				if(sum==56&&p+d==17) {
					System.out.print("돼지마리수 = "+p+"마리\n오리마리수 = "+d+"마리");
				}
			}
		}
		
		
		
		
	}
}
