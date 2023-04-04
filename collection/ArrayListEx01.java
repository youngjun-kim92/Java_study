package javapro.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		//배열(크기 고정)
		
		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("=================");
		
		//컬렉션(크기 가변)	: 추가, 삭제가 자유로움								//배열과 컬렉션의 차이점 : 배열은 크기가 정해져있지만 컬렉션은 크기가 변한다. 컬렉션은 인덱스에 값이 아니라 번지가 저장되있다. 번지에서 해당 값을 찾으러가는것
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);													//list에 값을 추가할땐 add메소드
		list.add(20);
		list.add(30);
		list.add(1,80);													//앞번째 숫자에 해당하는 인덱스에 뒤의 숫자 80을 가리키는 번지를 넣고 넣은 번지수 뒤번째 순서부터 전부 밀림(삽입개념)	
		list.remove(2);													//해당번째 인덱스를 삭제하고 전부 앞당김
		list.set(1,50);													//해당번째 인덱스의 값을 50을 나타내는 번지수로 바꿈
		list.clear(); 													//객체 전부 삭제
		for(int i=0;i<list.size();i++) {								//list에 저장된 값을 부르려면 get메소드를 쓴다.
			System.out.println(list.get(i));							//list컬렉션은 length가 아니라 size로 크기를 나타낸다.
		}
		
	}

}
