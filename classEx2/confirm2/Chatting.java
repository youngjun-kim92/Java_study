package javapro.classEx2.confirm2;

public class Chatting {

	//내부 클래스
	class Chat{
		
		//내부 클래스 메소드
		void start() {}
		
		void sendMessage(String message) {}
	}
	
	//메소드
	void startChat(String chatId) {
		String nickName=chatId;														//nickName변수는 startChat 메소드 로컬에서만 쓰는 변수로 final 성격을 자동으로 가져서 값을 두번 넣어줄 수 없다. 
		
		Chat chat=new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData="안녕하세요";
					String message="["+nickName+"]"+inputData;			
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
}
