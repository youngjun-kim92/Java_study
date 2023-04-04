package ch01.verify;

public class Ex04 {

	public static void main(String[] args) {
		String str="우리모두 코로나를 이겨냅시다.";
		int position=str.indexOf("코");
		System.out.println(position);
		char ch=str.charAt(position);
		System.out.println(ch);

	}

}
