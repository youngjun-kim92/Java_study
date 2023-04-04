package javapro.classEx2;

public class ButtonEx02 {

	public static void main(String[] args) {
		
		Button btnGameStart=new Button();
		btnGameStart.setClickListner(new Button.ClickListner() {			//Ex01은 OnListner클래스를 만들어서 한것이고 Ex02는 바로 익명객체를 만들어서 한것
			
			@Override
			public void onClick() {
				System.out.println("게임을 시작합니다.");
			}
		});
		
		btnGameStart.click();
		
		Button btnResult=new Button();
		btnResult.setClickListner(new Button.ClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("결과확인 버튼을 눌렀습니다.");
			}
		});
		
		btnResult.click();
	}

}
