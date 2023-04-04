package javapro.classEx2.confirm2;

public class AnonymousEx01 {

	public static void main(String[] args) {
		
		Anonymous anony=new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {							//익명객체 구현을 생각할것
			
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}

}
