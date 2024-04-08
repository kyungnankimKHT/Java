package com.kh.operatorPre;

import java.util.Scanner;

// 패키지 : 내가 만든 클래스가 들어있는 폴더 위치

//클래스 : 실행하고자 하는 코드를 작성하는 공간
public class OperatorPre {
	// 기본 출력 메서드
	// 최종으로 출력하는 메서드가 아니지만 상황에 따라
	// 최종 메서드에서 호출해 사용할 수 있는 메서드 중 하나
	//static : 메모리에서 고정
	public static void practice1() {// 모든 사람이 사탕을 골고루 나눠갖기
		// 스캐너를 이용해서 키보드로 입력받은 내용을 컴퓨터에 출력
		//System.in 키보드로 입력 받을 수 있게 해주는 출력 시스템
		// Scanner : 키보드로 입력받은 내용을 컴퓨터로 출력
		// 기본으로 갖춰져있기는 하지만 라이브러리에서 가져와야하기 때문에
		//import를 이용해서 가지고 옴
		Scanner sc = new Scanner(System.in);
		// 스캐너를 불러온 다음에 바로 sc 로 스캐너 기능을 불러와도 되긴 하지만
		//System.out.print 를 이용해서 어떤 행동을 진행하고 있는지
		//확인하는 작업을 진행할 것
		// 인원 수 입력 받기
		System.out.print("인원 수를 입력하세요 : ");
		int people = sc.nextInt();
		// 사탕 개수 입력 받기
		System.out.print("사탕 개수를 입력하세요 : ");
		int candies = sc.nextInt();
		
		//1인당 나눠줄 사탕 개수 계산
		int getCandies = candies / people;
		
		//나눠주고 남은 사탕 개수 계산
		int reMain = candies % people;
		// run : ctrl + f11
		//결과 출력
		System.out.println("참여 인원 : " + people);
		System.out.println("캔디 총 개수 : " + candies);
		System.out.println("동일하게 나눠가진 캔디 개수 : " + getCandies);
		System.out.println("남은 캔디 개수 : " + reMain);
	}
	
	
	//메인 메서드 : 최종으로 실행하는 메서드
	public static void main(String[] args) {
		//작성해준 메서드 중에서 실행이나 출력하고자 하는 메서드 작성 
		practice1();

	}

}








