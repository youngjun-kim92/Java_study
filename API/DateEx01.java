package javapro.API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		
		Date now=new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf;
		sdf=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");			//월과 시간은 대문자로 쓸 것(소문자m은 분, 대문자 H는 24시간, h는 12시간으로 표시)
		System.out.println(sdf.format(now));						//내가 만든 형식으로 출력해주는 것
		
		sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("yyyy년 MM월 dd일");					//포맷형식이 아닌건 그대로 찍히고 포맷형식은 바꿔서 찍힘
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");		//a는 오전,오후 표시해주는것 E는 요일
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("yyyy년 D번째 날입니다.");				//D는 1월 1일 이후부터 몇번째 날인지 알려줌
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("이번주는 MM월의 W번째 주입니다.");		//W는 오늘이 해당월의 몇번째 주인지 알려줌
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("이번주는 yyyy년의 w번째 주입니다.");		//w는 오늘이 해당년도의 몇번째 주인지 알려줌
		System.out.println(sdf.format(now));
		
		
	}

}
