package javapro.statement;

public class ForEx12 {

	public static void main(String[] args) {
		
		Outer:for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+ "-" +lower);
				if(lower=='f') {
					break Outer;			//break를 쓰면 for문 안에 있는 for문만 break되는데 제일 바깥쪽 for문에 Outer(아무거나 상관x)라고 라벨이름을 붙이고 break Outer(라벨이름);라 하면 전부 탈출
				}
			}
		}
	}
		
}

