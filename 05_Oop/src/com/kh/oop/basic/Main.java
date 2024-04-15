package com.kh.oop.basic;

public class Main {
	
	// 내가 만든 파일 중에서 최종적으로 출시할 파일만 실행
	public static void main(String[] args) {
	/*
		// 쿠키 클래스의 객체 생성
		쿠키 myCookie = new 쿠키();
		
		//객체의 속성 설정
		//쿠키의 크기와 모양을 설정
		myCookie.size = "라지";
		myCookie.shape = "동그라미";
		
		// 쿠키에 대한 정보 출력
		System.out.println("쿠키의 크기 : " + myCookie.size);
		System.out.println("쿠키의 모양 : " + myCookie.shape);
		
		
		쿠키 카페판매용쿠키 = new 쿠키();
		카페판매용쿠키.size = "아담함";
		카페판매용쿠키.shape = "별모양";
		
		System.out.println("쿠키의 크기 : " + 카페판매용쿠키.size);
		System.out.println("쿠키의 모양 : " + 카페판매용쿠키.shape);
	*/
		// Nation 객체 생성
		Nation 국민 = new Nation();
		
		국민.name = "홍길동";
		국민.age = "55세";
		국민.gender = 'F';
		국민.jumin = "550101-2345678";
		
		System.out.println("이름 : " + 국민.name);
		System.out.println("나이 : " + 국민.age);
		System.out.println("성별 : " + 국민.gender);
		System.out.println("주민번호 : " + 국민.jumin);
		
		국민.speakKorean();
		
	}

}






