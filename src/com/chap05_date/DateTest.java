package com.chap05_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		//Date
		Date today = new Date();
		System.out.println(today);
		
		System.out.println(new Date(0L).toGMTString()); //지역 상관없이 그리니치 표준시
		
		
		//Date day1 = new Date(0L);  기본 세팅 시간에 우리나라 시간으로 적용되어 9시
		Date day1 = new Date(1000L);
		System.out.println(day1);
		
		//Date day2 = new Date(100+22, 8, 11);
		//System.out.println(day2);
		
		//원하는 패턴으로 출력
		//SimpleDateFormat 클래스 사용
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(today));
		
		System.out.println("-------캘린더-------");
		
		Calendar calendar = Calendar.getInstance();  //현재시간
		System.out.println(calendar);
		
		System.out.println(calendar.getTime());
		
		int year = calendar.get(1);
		//int month = calendar.get(2)+1;
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		
		
		System.out.printf("%d년 %d월 %d일 %d:%d:%d",year,month,date,hour,min,sec);
		
		System.out.println();
		System.out.println("-------");
		
		//SimpleDateForm을 활용하여 calendar 날짜 출력 yyyy-MM-dd hh:mm:ss
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf2.format(calendar.getTime()));
		
		//GregorianCalendar
		System.out.println("---------그레고리안---------");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println("year: "+gc.get(Calendar.YEAR));
		System.out.println("month: "+(gc.get(GregorianCalendar.MONTH)+1));
		
		System.out.println(gc.isLeapYear(2024));
		
		
		
		
		
		
		
				
		
		
		
		

	}

}
