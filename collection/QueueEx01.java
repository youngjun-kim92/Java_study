package javapro.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		
		Queue<Message> messeageQueue=new LinkedList<>();				//stack은 클래스, Queue는 인터페이스 -> 따라서 queue를 구현해서 override하는 대표클래스가 Linkedlist
		messeageQueue.offer(new Message("SendMail", "김철수")); 			//queue에 값을 넣을 때는 offer 메소드
		messeageQueue.offer(new Message("SendSMS", "홍길동"));
		messeageQueue.offer(new Message("SendKatalk", "이영희"));
		
		while(!messeageQueue.isEmpty()) {
			Message message=messeageQueue.poll(); 						//poll : queue 값을 빼서 message에 넣어줌				
			switch(message.command) {
				case "SendMail":
					System.out.println(message.to+"님에 메일을 보냅니다.");
					break;
				case "SendSMS":
					System.out.println(message.to+"님에 SMS를 보냅니다.");
					break;
				case "SendKatalk":
					System.out.println(message.to+"님에 카카오톡을 보냅니다.");
					break;
			}
		}
		
	}

}
