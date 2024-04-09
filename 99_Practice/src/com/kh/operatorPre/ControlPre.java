package com.kh.operatorPre;

import java.util.Scanner;

/* 잘라내기(ctrl + x)  복사(ctrl + c) 붙여넣기(ctrl + v) */
public class ControlPre {
	//실습문제 1번 홀수 짝수 나타내기
	public static void practice1() {
		// 키보드로 입력받은 정수가 양수이면서 짝수일 때만 짝수입니다 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt(); //키보드로 숫자 입력받기
		
		if(number > 0) { // 입력받은 숫자가 양수일 경우에만 홀짝 실행하기	
			if (number % 2 == 0) { //숫자가 짝수일 경우 출력하기
				System.out.println("짝수입니다.");
			} else {               //숫자가 홀수일 경우 출력하기
				System.out.println("홀수입니다.");
			}
		} else { 		// 입력받은 숫자가 음수일 경우 출력하기
			System.out.println("음수입니다. 양수만 입력해주세요.");
		}
	}
	
	public static void practice2() {
		//키보드로 국어 영어 수학 점수 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		// 합계와 평균 계산
		int totalScore = korean + english + math; //합계
		double averageScore = totalScore / 3.0;
		//합격 여부 판별
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
		if(korean >= 40 && english >= 40 && math >= 40 && averageScore >= 60) {
			System.out.println("국어 점수 : " + korean);
			System.out.println("영어 점수 : " + english);
			System.out.println("수학 점수 : " + math);
			System.out.println("합    계 : " + totalScore);
			System.out.println("평    균 : " + averageScore);
			
			System.out.println("축하합니다. 합격입니다!!!");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
	}
	public static void main(String[] args) {
		practice1();

	}

}





