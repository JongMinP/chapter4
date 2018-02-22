package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// 현재 시간

		Date now = new Date();

		System.out.println(now);
		printDate(now);

		// 특정 시간 세팅(2000/08/04)
		Date d1 = new Date(100, 7, 4); // Date는 언제가 사라짐 Calender를 사용
		printDate(d1);

		// 특정 시간 세팅(2000/08/04 14:30:30)
		Date d2 = new Date(100, 7, 4, 14, 30, 30);
		printDate(d2);
		
		// 1970년 1월 1일 00 : 00 : 00 기준
		Date d3 = new Date(24L * 60 * 60 * 1000 * 365 * 30);
		
		printDate(d3);
		
		printDate2(now);
		
	}

	public static void printDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시mm분ss초");
		// new SimpleDateFormat("yyyy/ MM/ dd hh :mm:ss");
		System.out.println(sdf.format(date));

	}
	
	public static void printDate2(Date d) { //년도는 1900을 더하고 월은 1을 더하고
		// 년도 (+1900)
		int year = d.getYear();
		
		// 월(0-11)
		int month = d.getMonth();
		
		// 일
		int date = d.getDate();
		
		// 시
		int hour = d.getHours();
		
		// 분
		int minutes = d.getMinutes();
		
		// 초
		int seconds = d.getSeconds();

		
		System.out.println(String.format("%02d", hour)); // 2자리로 빈건 제외
		
		System.out.println(
				(year + 1900) + "년" +
			    (month +1) + "월" +
				date + "일" + 
			    hour + ":" +
				minutes + ":" +
			    seconds);
	}

}
