package day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		String t = today.toString();
		System.out.println(t);
		
		System.out.println();
		
		//T와 .기준으로 문자열 나눠서 출력하기
		String date = t.substring(0,t.indexOf("T"));
		System.out.println(date);
		String time = t.substring(t.indexOf("T")+1, t.indexOf("."));
		System.out.println(time);
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
	
		LocalDateTime sDate = LocalDateTime.of(1999, 10, 16, 9, 30); //날짜 직접 생성
		System.out.println(sDate.format(dtf));
	
	}

}
