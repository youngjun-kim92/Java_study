package javapro.statement;

public class WhileEx03 {

	public static void main(String[] args) {				//do{}~while(조건); 
															//while문과 차이점은 무조건 1번 이상은 실행시키고 싶을때는 do~while문을 쓴다. do를 먼저 실행시키고 조건은 나중에 보기 때문
		int i=1;
		do {
			System.out.println("안녕하세요");
			i++;
		} while(i>=5);
	}
}
