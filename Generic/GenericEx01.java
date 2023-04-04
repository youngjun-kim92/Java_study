package javapro.Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericEx01 {

	public static void main(String[] args) {
		
		int[] nums=new int[5];
		nums[0]=50;
		nums[1]=70;
		System.out.println(nums[1]);
		
		List list=new ArrayList();						//List에는 번지가 있고 각각의 배열 순서에도 번지가 있어서 번지에 실제 내가 입력한 값을 기억한다.(자료구조형태(동적배열) : 번지 - 번지 - 실제값)
		list.add("홍길동");
		list.add(50);
		list.add(45.64);
		list.add(false);							
		
		String name=(String)list.get(0);				//얘네는 object로 다 받을수 있게 되어있어 특정한 객체로 바꿔주려면 캐스팅을 해줘야된다.
		int number=(int)list.get(1);
		System.out.println(list.get(2));	 			//list 배열에 몇번째 값을 출력
		
		List<String> list2=new ArrayList<String>();		//String타입만 배열로 받겠다 -> 배열과 다른것은 List는 크기가 정해져있지 않다. add하면 하나씩 계속 증가 - 제거도 가능
		list2.add("김철수");
		list2.add("이영희");
		list2.add("박찬호");
		list2.remove(1);								//1번째 방에 있는 이영희 제거 -> 2번째 방에 있는 박찬호가 자동으로 1번으로 옮겨짐
		System.out.println("**출석명단**");
		for(int i=0;i<list2.size();i++) {				//얘는 length가 아닌 size로 갖고온다.
			System.out.println("이름 : "+list2.get(i));
		}
		String na=list2.get(0);							//이미 타입이 String으로 정해져서 받았기 때문에 다시 캐스팅할 필요가없다.
	}

}
