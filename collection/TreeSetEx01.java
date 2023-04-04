package javapro.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores=new TreeSet<>();						//Tree는 나무구조로 처음 add한 값 기준으로 값이 크면 우측 작으면 좌측으로 내려가는 구조로 저장
		scores.add(87);													//자동으로 오름차순으로 정리
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		for(Integer s:scores) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("가장 낮은 점수 : "+scores.first()); 			//제일 좌측이 가장 작은값이 되므로 작은값은 first값이 된다.
		System.out.println("가장 높은 점수 : "+scores.last()); 				//제일 우측이 가장 큰값이 되므로 큰값은 last값이 된다.
		System.out.println("95점 아래 점수 : "+scores.lower(95));
		System.out.println("95점이거나 바로 아래 점수 : "+scores.floor(95));
		System.out.println("85점이거나 바로 위 점수 : "+scores.ceiling(85));
		
		NavigableSet<Integer> descScores=scores.descendingSet();		//내림차순으로 정리
		for(Integer s:descScores) {
			System.out.print(s+" ");
		}

	}

}
