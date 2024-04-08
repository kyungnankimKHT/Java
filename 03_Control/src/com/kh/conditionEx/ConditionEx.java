package com.kh.conditionEx;

import java.util.Scanner;

// 패키지 : 작성한 파일의 폴더 위치

//조건문 기능용 클래스
public class ConditionEx {
	/*
	 if 주어진 조건이 참일 때 실행되는 코드 블록
	 else 조건이 거짓일 때 실행되는 코드 블록(필수가 아님)
	 
	 사용방법
	 if (조건문) {
	 	조건이 참일 경우 실행할 코드 작성
	 	만약에 조건문의 조건이 참이 아닐 경우 
	 	자동으로 실행 종료
	 }
	 */

	// 메서드 1 : 19세 이상은 성인입니다. 출력하기
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요 : " );
		int age = sc.nextInt();
	}
	
	
	// 최종 메서드
	public static void main(String[] args) {
		

	}

}
