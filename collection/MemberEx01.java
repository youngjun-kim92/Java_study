package javapro.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberEx01 {

	public static void main(String[] args) {
		
		Set<Member> set=new HashSet<>();
		set.add(new Member("홍길동", 50));
		set.add(new Member("김철수", 25));
		set.add(new Member("이영희", 25));
		set.add(new Member("홍길동", 50));										//중복되는 값이 아님 -> new로 생성됐기 때문
																				//클래스에 hashcode와 equlas를 새롭게 override해서 중복되는 값이 있다면 새롭게 객체를 인식하는 것이 아니라 기존 중복객체로 인식하게끔 만듬
		Iterator<Member> iterator=set.iterator();
		while(iterator.hasNext()) {
			Member member=iterator.next();
			System.out.println("이름 : "+member.name+", 나이 : "+member.age);
		}
		System.out.println("총 인원수 : "+set.size());
		

	}

}
