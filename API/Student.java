package javapro.API;

public class Student {
	
	//필드
	private int no;
	private String name;
	
	//생성자
	public Student(int no, String name) {
		this.no=no;
		this.name=name;
	}

	//메소드(getter/setter)
	public int getNo() {
		return no;
	}

	@Override
	public int hashCode() {
		int hashCode=no+name.hashCode();			//hashcode : 실제 문자가 들어있는 메모리번지를 특수한 공식으로 함부로 접근하지 못하게 만들어진 code값
		return hashCode;
	}												//toString이라는 메소드는 String 변수에 들어있는 메모리번지수가 아닌 실제 문자열을 돌려주는 메소드로 기본적으로 생략해서 쓰면 기본적으로 이 toString메소드를 호출해서 문자열을 읽히게 해준다.

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student target=(Student)obj;
			if(no==target.getNo()&&name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
