package com.kh.javaAPI.Date.Ex;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
Date : 특정 날짜와 시간을 나타내는 클래스
Calendar : 날짜와 시간을 조작하는데 사용되는 추상클래스
Gre go rian Calendar = 그레고리력을 사용해서 날짜와 시간을 계산
SimpleDateFormat = 날짜와 시간을 형식으로 보여주고 그것을 출력
LocalDate
KST = Korean Standard Time
	=  한국   일반적인   시간

 * */
public class DateEx {
	public static void main(String[] args) {
		//1. Date
		Date 현재데이트 = new Date();
		System.out.println(현재데이트);
		//2. Calendar
		Calendar 캘린더 = Calendar.getInstance();
			//년 월 일
		int 년 = 캘린더.get(Calendar.YEAR);
		int 월 = 캘린더.get(Calendar.MONTH); //0월부터 가져오기 때문에 +1 을 해줘야함
		int 일 = 캘린더.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재 날짜 : " + 년 + "/" + (월 + 1) + "/" +일 );
	
		GregorianCalendar 그레고리안1 = new GregorianCalendar();
		GregorianCalendar 그레고리안2 = new GregorianCalendar(2024, 4, 23);
		int 날짜 = 그레고리안2.get(Calendar.DAY_OF_WEEK);
		System.out.println("날짜 : " + 날짜);
	}
}

















