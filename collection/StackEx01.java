package javapro.collection;

import java.util.Stack;

public class StackEx01 {												//스택은 나중에 들어온 값이 먼저 나감

	public static void main(String[] args) {
		
		Stack<Coin> coinBox=new Stack<Coin>();
		coinBox.push(new Coin(100)); 									//스택에 값을 넣을때는 push 메소드
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {										//.isEmpty : 값이 비었는지 물어보는 메소드
			Coin coin=coinBox.pop();									//스택에서 값을 뺄때는 pop 메소드
			System.out.println("꺼내온 동전 : "+coin.getValue()+"원");
			
		}
	}

}
