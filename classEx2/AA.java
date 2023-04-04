package javapro.classEx2;

public class AA {
	
	int fieldAA1;
	
	public AA() {
		//로컬 클래스(생성자 또는 메소드 내부에서 선언된 클래스) : 생성자 또는 메소드 내부에서만 쓸 수 있다. 밖에 접근 못함
		class BB {
			
		}
		BB bb=new BB();
	}
	
	void methodAA1() {
		class CC {
			
		}
	}

}
