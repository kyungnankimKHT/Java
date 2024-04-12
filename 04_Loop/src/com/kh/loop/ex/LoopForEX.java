package com.kh.loop.ex;

import java.util.Scanner;

public class LoopForEX {
	//기본 메서드
	
	// LoopForEX 에서 출력하길 원한다면 
	// public static void guguDan 으로 static을 추가해준 다음에
	// public static void main(String[] args){
	//    guguDan(); 
	// }
	// static을 붙이지 않고 출력하길 원한다면 
	// 출력용 클래스를 만들어서 출력하기 LoopForRun
	// 종료를 하기 전까지 반복해서 출력
	public void guguDan() {
		//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 세계로 오신 것을 환영합니다.");
		
		// 구구단 0 을 입력하기 전까지 반복해서 출력하기
		// 반복하기 위해 while문 사용
		while(true) {
			System.out.println("종료를 원하면 0 입력하기");
			System.out.print("원하는 수를 입력해주세요.");
			int dan = sc.nextInt();
			
			// 만약에 숫자 0이 들어오면 프로그램 종료하기
			if (dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			//받은 수를 for 문 이용해서 출력
			for ( int a = 1; a <= 9; a++) {
				System.out.println(dan + " 단 *" + a +" = " + (dan * a));
			}
		}
	}

	
	//구구단 입력 받아 거꾸로 출력하기
	public void guguDan2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("거꾸로 세계에 오신 것을 환영합니다.");
		while(true) {
			System.out.println("종료를 원할 경우 0을 입력하기");
			System.out.println("원하는 수를 입력하세요.");
			int dan = sc.nextInt();
			
			//만약에 0이 들어온다면 프로그램 종료
			if (dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;//for while switch 사용 가능 if 단독x
			}
			
			// continue 자주 사용되지 않음
			// if 1~ 9까지만 입력 가능하도록 조건
			if (dan < 1 || dan > 9) {
				System.out.println("1부터 9까지의 숫자를 입력해주세요.");
				continue;	
			}
			
			for(int a = 9; a >= 1; a--) {
				System.out.println(dan + " * " + a + " = " + (dan * a));
			}
		}
		// 4. 종료를 원할경우 0을 입력해주면 종료하기 while문  추가하기
	}

	
	//구구단을 1단부터 9단까지 모두 출력
	public void guguDan3() {
		//1단부터 9단까지 출력
		for (int dan = 1; dan <= 9 ; dan++) {
			System.out.println("***** " + dan + " *****");
			// 1단에서 부터 1 ~ 9 를 곱해준 값을 출력
			for(int num = 1; num <= 9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan *  num));
			}
		}
	}
	
	// 구구단을 2단부터 9단까지 출력
	public void gugudan4() {
		
	}
}












