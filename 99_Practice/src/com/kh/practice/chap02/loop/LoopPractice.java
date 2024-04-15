package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	//Geeting : 안녕하세요 인사를 출력하는 메서드
	//1미만의 숫자가 입력됐다면
	//1 이상의 숫자를 입력해주세요가 출력되면서
	//다시 사용자가 값을 입력하도록 하기
	
	
	public void practice1() {
		//사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력
		//단, 입력한 수는 1보다 크거나 같아야하고 만일 1미만의 숫자를 입력했다면
		// 1이상의 숫자를 입력해주세요 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		// 입력받은 숫자가 1 미만일 경우 출력해주기
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			return;
		}
		
		//입력받은 숫자가 1 이상이면 1부터 입력받은 숫자까지 모두 출력해주기
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			//System.out.println(i + " <= " + num);
		}
		//마무리로 줄바꿈을 해주길 원한다면
		System.out.println();//줄바꿈 완성!
	}
	
	
	
	
	
	
	
	
	
	
	
	public void practice2() {
		//입력받기 위해서는 스캐를 통해서 입력 받기
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("숫자를 입력하세요 :");
			num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력하세요.");
			} else {
				break;
			}
		}
		//1부터 ~ 까지의 숫자들이 나왔는지 출력을 보고싶다면
		System.out.println("1부터 " + num + "까지의 숫자들");
		int i = 1;
		while( i <= num) {
			System.out.print(i + " ");
			++i;
		}
		System.out.println();
	}
	
	public void practice3() {
		//사용자로부터 한 개의 값을 입력받아
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("**** practice 3 시작 ****");
		//단 입력한 수는 1보다 크거나 같아야 함
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 다시 입력해주세요");
			} else {
				break;
			}
		}
		
		System.out.println(num + " 부터 1까지의 숫자들을 거꾸로 출력합니다.");	
		
		//1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하기
		while(num >= 1) {
			System.out.print(num + " ");
			num--; // 키보드로 입력받은 숫자에서  -1을 하면서 1이 될 때 까지 출력
		}
		//System.out.println();	
	}
	
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		//두 정수와 연산기호를 받아서 계산하는 메소드
		//연산의 경우에는 + / * - %
		String operator; //char operator charAt
		
		while(true) {
			System.out.println("프로그램 종료를 원할 경우 exit 입력할 것");
			System.out.print("연산입력(+ - * / %) : ");
			
			operator = sc.next();
			
			//만약에 exit를 입력해서 프로그램 종료를 원할 경우
			//문자열(String)으로 비교를 할 경우 equals ==
			if(operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			//정수1과 정수2를 입력 받아서 계산하기
			System.out.print("정수1 : ");
			int 정수1 = sc.nextInt();
			System.out.print("정수2 : ");
			int 정수2 = sc.nextInt();
			
			//정수1과 정수2 계산에 대한 결과(=result)
			int 결과;
			
			//switch case "+"
			if (operator.equals("+")) {
				결과 = 정수1 + 정수2;
			} else if (operator.equals("-")) {
				결과 = 정수1 - 정수2;
			} else if (operator.equals("*")) {
				결과 = 정수1 * 정수2;
			} else if (operator.equals("/")) {
				//몫 같은 경우에는 0으로 나눌 수 없기 때문에 정수2는 0이 될 수 없음
				if(정수2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				결과 = 정수1 / 정수2;
			} else if (operator.equals("%")) {
				// 나머지 경우 0으로 나눌 수 없기 때문에 정수2는 0이 될 수 없음
				if(정수2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					
				}
				결과 = 정수1 % 정수2;
				
			} else {
				System.out.println("잘못입력했습니다.");
				continue;
			}
			System.out.println(정수1 + " " + operator + " "+ 정수2 + " = " +결과);
		}
	}
	

	
	public void Geeting() {
		System.out.println("안녕하세요.");
	}
	
	//Geeting2 : 반갑습니다 인사를 출력하는 메서드
	public void Geeting2() {
		System.out.println("반갑습니다.");
	}
}
