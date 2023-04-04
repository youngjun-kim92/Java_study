package javapro.classEx2.confirm2;

public class ActionEx01 {

	public static void main(String[] args) {
		Action action=new Action() {							//인터페이스를 구현할 클래스를 따로만들지 않고 익명으로 인터페이스를 실행
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		action.work();
	}
	
}
