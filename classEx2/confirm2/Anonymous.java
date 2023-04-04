package javapro.classEx2.confirm2;

public class Anonymous {
	
	Vehicle field=new Vehicle() {						//인터페이스의 익명 구현 객체 필드
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다");
		}
	};
	
	void method1() {									//인터페이스를 메소드의 로컬변수로 사용
		Vehicle localVar=new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다");
			}
		};
		localVar.run();
	}
	
	void method2(Vehicle v) {							//인터페이스를 메소드의 매개변수로 사용
		v.run();
	}

}
