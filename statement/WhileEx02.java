package javapro.statement;

public class WhileEx02 {

	public static void main(String[] args) {
		/*(방법1)
		
		int dice=0;								//초기값 주는거 잊지말기...ㅜㅜ
		
		while(dice!=5) {
			dice=(int)((Math.random()*6)+1);
			System.out.println(dice);
		}*/
		
		/*(방법2)
		
		int dice;
		
		while(true) {
			dice=(int)((Math.random()*6)+1);
			System.out.println(dice);
			if(dice==5) break;
		}*/
		
		//(방법3)
		
		int dice;
		boolean run=true;
		while(run) {
			dice=(int)((Math.random()*6)+1);
			System.out.println(dice);
			if(dice==5) run=false;
		}
		
	}
}
