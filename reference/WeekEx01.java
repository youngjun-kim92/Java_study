package javapro.reference;

import java.util.Calendar;

public class WeekEx01 {

	public static void main(String[] args) {
		
		Week today=null;
		Calendar now=Calendar.getInstance();						//컴퓨터에 저장되있는 날짜, 시간, 장소 등등을 가져옴
		int week=now.get(Calendar.DAY_OF_WEEK);
		
		/*System.out.println(now.get(Calendar.YEAR));				//now에 저장되있는 모든 정보 중에 년도만 출력
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));*/
		
		switch(week) {
			case 1:
				today=Week.SUNDAY;
				break;
			case 2:
				today=Week.MONDAY;
				break;
			case 3:
				today=Week.TUESDAY;
				break;
			case 4:
				today=Week.WEDNESDAY;
				break;
			case 5:
				today=Week.THURSDAY;
				break;
			case 6:
				today=Week.FRIDAY;
				break;
			case 7:
				today=Week.SATURDAY;
				break;
		}
		
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 쉽니다.");	
		}
		else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
	}

}
