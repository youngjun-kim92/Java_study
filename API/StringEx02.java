package javapro.API;

import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class StringEx02 {

	public static void main(String[] args) {

		String data="김철수&이영희,홍길동-박찬호,이영표";
		String[] names=data.split("&|,|-");											//split이 token보다 많이 쓰이는데 여러가지 분리자를 쓸수 있기 때문
																					//|은 or
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("===============================");
		
		String data2="김철수,이영희,홍길동,박찬호,이영표";
		StringTokenizer st=new StringTokenizer(data2,",");							//split과 마찬가지로 ,을 기준으로 토큰화(분리) -> 단 한종류의 분리자만 쓸수있다.
		
		while(st.hasMoreTokens()) {													//다음 token문자를 갖고옴
			String name=st.nextToken();												//토큰 문자를 갖고옴
			System.out.println(name);
		}
		
	}

}
