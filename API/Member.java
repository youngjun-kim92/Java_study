package javapro.API;

public class Member {
	
	//필드
	String id;
	
	//생성자
	public Member(String id) {						//Object라는 클래스는 모든 클래스의 부모이므로 extends를 안쓰더라도 잠정적으로 모든 class는 Object를 상속
		this.id=id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member target=(Member)obj;
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
