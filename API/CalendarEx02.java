package javapro.API;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx02 {

	public static void main(String[] args) {
		
		TimeZone tz=TimeZone.getTimeZone("America/Los_Angeles");		//캘린더와 데이트의 차이 -> 캘린더는 해당 지역의 정보를 갖고오고 데이트는 컴퓨터의 정보를 갖고옴
		
		Calendar now=Calendar.getInstance(tz);		
		System.out.println(now);
		
		int year=now.get(Calendar.YEAR);			
		System.out.println(year);
		
		int month=now.get(Calendar.MONTH)+1;
		System.out.println("이번달 : "+month);
		
		int day=now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		int week=now.get(Calendar.DAY_OF_WEEK);
		String w=null;
		switch(week) {
			case Calendar.SUNDAY:
				w="일요일";
				break;
			case Calendar.MONDAY:
				w="월요일";
				break;
			case Calendar.TUESDAY:
				w="화요일";
				break;
			case Calendar.WEDNESDAY:
				w="수요일";
				break;
			case Calendar.THURSDAY:
				w="목요일";
				break;
			case Calendar.FRIDAY:
				w="금요일";
				break;
			case Calendar.SATURDAY:
				w="토요일";
				break;
		}
		int hour=now.get(Calendar.HOUR);
		int minute=now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		int ampm=now.get(Calendar.AM_PM);
		String strAmpm=null;
		if(ampm==0) {
			strAmpm="오전";
		}
		else {
			strAmpm="오후";
		}
		
		System.out.print("현재 로스엔젤레스는 "+year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		System.out.println(w+"입니다.");
		System.out.print("현재 로스엔젤레스 시간은 "+strAmpm+" ");
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
		System.out.println(second+"초입니다.");
		
	}

}
