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
	
	public static void main(String[] args) {
		practice1();

	}

}





