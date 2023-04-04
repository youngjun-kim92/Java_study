package javapro.classEx2;

import javax.swing.ButtonModel;

public class ButtonEx01 {

	public static void main(String[] args) {
		
		Button btnGameStart=new Button();
		
		class OnListner implements Button.ClickListner {				//버튼클릭을 구현하는 클래스

			@Override
			public void onClick() {
				System.out.println("게임시작을 클릭했습니다.");
			}
			
		}
		
		btnGameStart.setClickListner(new OnListner());
		btnGameStart.click();
		Button btnResult=new Button();
		
		class ResultListner implements Button.ClickListner {

			@Override
			public void onClick() {
				System.out.println("결과 확인 버튼을 클릭했습니다.");
			}
			
		}
		btnResult.setClickListner(new ResultListner());
		btnResult.click();

	}

}
