package com.kh.test.main;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		//switch case 문 실행해보기
		Scanner 스캐너 = new Scanner(System.in);
		System.out.print("숫자 작성");
		int 날짜 = 스캐너.nextInt(); //숫자를 받는 스캐너 작성
		String 할일;
		
		switch(날짜) {
		case 1:
			할일 = "월요일 : 업무";
			break;
		case 2:
			할일 = "화요일 : 공부";
			break;
		default :
			할일 = "날짜와 관계없이 휴식";
			break;
		}
		
		System.out.println("일정 : " + 할일);
	}
}









