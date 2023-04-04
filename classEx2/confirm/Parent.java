package javapro.classEx2.confirm;

public class Parent {
	
	//필드
	public String nation;
	
	//생성자
	//1
	public Parent() {
		this("대한민국");												//this가 생성자를 호출하는건데 대한민국이 nation에 전달되고 nation이 this.nation으로 전달된다
		System.out.println("Parent() call");
		
	}
	//2
	public Parent(String nation) {
		this.nation=nation;
		System.out.println("Parent(String nation) call");
		
	}

}
