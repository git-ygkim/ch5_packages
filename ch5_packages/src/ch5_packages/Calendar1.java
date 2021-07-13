package ch5_packages;

import java.util.Calendar;

/*
	Calendar
		. 추상 클래스
		. 년, 월, 일, 시간, 분, 초, 밀리초 정보를 담고 있다. 
		. set() get()
		
 */

public class Calendar1 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH) + 1;	// MONTH는 0부터 시작해서 1을 더해주어야 함
		int dd = now.get(Calendar.DATE);

		System.out.print(yy + "년 " + mm + "월 " + dd + "일 " + "");

		String ampm = "";	// String은 값을 초기화 해 주어야 한다. 
		
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int min = now.get(Calendar.MINUTE);	//분
		int sec = now.get(Calendar.SECOND);	//초

		
		if(hourOfDay > 12) {
			ampm = "오후 ";
			hourOfDay -= 12;
		} else if(hourOfDay < 12) {
			ampm = "오전 ";
		}
		
		System.out.print(ampm + (hourOfDay) + ":" + min + ":" + sec + " ");
		
		
		int week2 = now.get(Calendar.WEEK_OF_YEAR);
		int week = now.get(Calendar.DAY_OF_WEEK);	// 정수 값으로 반환됨. 1-일요일~7-토요일
		
		switch(week) {
			case Calendar.SUNDAY:
				System.out.println("일요일");break;
			case Calendar.MONDAY:
				System.out.println("월요일");break;
			case Calendar.TUESDAY:
				System.out.println("화요일");break;
			case Calendar.WEDNESDAY:
				System.out.println("수요일");break;
			case Calendar.THURSDAY:
				System.out.println("목요일");break;
			case Calendar.FRIDAY:
				System.out.println("금요일");break;
			case Calendar.SATURDAY:
				System.out.println("토요일");break;
		}
		
		
		
		
		
	}

}
