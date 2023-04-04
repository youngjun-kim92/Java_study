package javapro.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {

	
	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();			//set컬렉션은 hashset이 제일 많이 쓰이며 객체를 중복해서 저장할 수 없고 순서도 마음대로 바뀐다.
		set.add("홍길동");								//set은 추가,제거는 가능하지만 특정 인덱스의 값을 갖고오는 get은 안됨
		set.add("김철수");
		set.add("이영희");
		set.add("김철수");								//중복 객체이므로 저장되지 않음
		
		System.out.println("총인원수 : "+set.size());
		/*for(String name:set) {
			System.out.println("이름 : "+name); 			//구슬주머니 같은 개념이라 순서는 뒤죽박죽 나옴
		}*/
		
		set.remove("이영희");								//제거는 특정값을 직접 입력하면 된다.
		System.out.println("총인원수 : "+set.size());
		
		//향상된 for문과 비슷
		Iterator<String> iterator=set.iterator();		//iterator는 set객체를 하나하나 가져와서 iterator객체에 집어넣고
		while(iterator.hasNext()) {						//hasNext는 가져올 객체가 있으면 true로 리턴 없으면 false로 리턴
			String name=iterator.next();				//가져온 객체를 하나씩 끄집어내서 새로운 객체에 집어넣기
			System.out.println("이름 : "+name);
		}

	}

}
