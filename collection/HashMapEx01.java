package javapro.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		//Map<String, Integer> map=new Hashtable<>(); -> 스레드환경에서 쓰임
		Map<String, Integer> map=new HashMap<>();								//앞 : key, 뒤 : value로 둘다 객체값이며 key는 중복저장이 안되지만 value는 중복저장 가능
		map.put("김철수", 85);													//map에 값을 넣어줄때는 put메소드를 쓴다.
		map.put("홍길동", 60);										
		map.put("이영희", 90);
		map.put("박찬호", 80);
		map.put("이영표", 72);
		System.out.println("총 응시자수 : "+map.size());
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력하세요>> ");
		String name=sc.next();
		System.out.println("점수 : "+map.get(name));								//key를 가지고 value값을 찾을 수 있다.(매우중요)	
		System.out.println();
		
		System.out.println("**성적현황표**");
		System.out.println("===============");
		System.out.println("이름     점수    ");
		Set<String> key=map.keySet();											//map에 있는 key값들만 set에 넣을 수 있다.
		Iterator<String> iterator=key.iterator();								//Iterator는 객체값을 하나하나 갖고오는 것
		while(iterator.hasNext()) {
			String na=iterator.next();
			Integer score=map.get(na);
			System.out.println(na+"    "+score);
		}
		System.out.println();
		
		map.remove("이영희");														//삭제
		
		System.out.println("**수정된 성적현황표**");
		System.out.println("===============");
		System.out.println("이름     점수    ");
		Set<Entry<String, Integer>> setEntry=map.entrySet();					//아예 entry라는 인터페이스를 활용해서 key와 value값을 set에 그대로 넘겨준다.
		Iterator<Entry<String, Integer>> entryIterator=setEntry.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry=entryIterator.next();
			String nameKey=entry.getKey();
			Integer scoreValue=entry.getValue();
			System.out.println(nameKey+"    "+scoreValue);
		}

	}

}
