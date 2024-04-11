package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEX {
	
	/*
		 while문을 사용해서 
		 4번을 누르면 프로그램을 종료하는 코드를 작성하기
		 public static void method1() {
			 Scanner sc = new Scanner(System.in);
			 1. 게임하기 2. 수영하기 3. 잠자기 4. 프로그램 종료
			 int menu
			 while(true) {
			 	System.out.println("~~ 프로그램 작성");
			 	System.out.print("원하는 프로그램 번호를 입력해주세요 : ");
			 	switch(menu) {
			 		case 1: 
			 		
			 		case 4:
			 	} 
			 }
		 
		 }
	 */
	
	public static void method1() {
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
			System.out.println("=============[메뉴판]=============");
		 	System.out.println("1.아메리카노 2.카페라떼 3.녹차 4.주문취소");
		 	
		 	System.out.print("메뉴를 입력해주세요 : ");
		 	
		 	int menu = sc.nextInt();
		
		 	switch(menu) {
		 		case 1: 
		 			System.out.println("아메리카노");
		 			break;
		 		case 2:
		 			System.out.println("카페라떼");
		 			break;
		 		case 3:
		 			System.out.println("녹차");
		 			break;
		 		case 4:
		 			System.out.println("주문취소");
		 			return;
		 		default:
		 			System.out.println("번호를 잘못 입력했습니다.");
		 	}
		 }
	 }
	
	
	public static void kh카페() {
	 	Scanner sc = new Scanner(System.in);
	 	while(true){
		 	System.out.println("kh카페에 오신걸 환영합니다. ^^* \n"
		 					+ "원하는 메뉴를 입력해주세요. \n"
		 					+ "1 아메리카노 2 카페라떼 3 녹차 4 흑당버블티 5 주문취소");
		 	
		 	String menu = sc.next();
		 	
		 	switch (menu) {
		 		case "1": case "아메리카노":
		 			System.out.println("아메리카노 주문 추가되었습니다.");
		 			break;
		 		case "2": case "카페라떼":
		 			System.out.println("카페라떼 주문 추가되었습니다.");
		 			break;
		 		case "3": case "녹차":
		 			System.out.println("녹차 주문 추가되었습니다.");
		 			 break;
		 		case "4": case "흑당버블티":
		 			System.out.println("흑당버블티 주문 추가되었습니다.");
		 			break;
		 			
		 		case "5": case "주문취소" :
		 			System.out.println("주문이 취소되었습니다. 다음에 방문해주세요.");
		 			return;
		 			
		 		default:
		 			System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요.");
	 	
		 	}
	 	}
	 	
	 	
	 
	 }
	 
	
	public static void getMoney() {
		//커피 10잔 커피값 300원
		int coffee = 10;
		int  money = 300;
		
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 제공");
			//커피가 10잔인데 1잔 제공했다면 -1
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + " 잔 입니다.");
			//커피가 모두 소진됐다면 판매를 중지하자
			if(coffee == 0) {
				System.out.println("커피가 다 소진됐습니다. 판매를 중지합니다.");
				return;
			}
		}
	}
	
	// 1부터 5까지 숫자를 출력
	public static void allNumber() {
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++; // num = num + 1;
		}
	}
	
	//10번찍어서 안넘어가는 나무 없습니다.~!
	//나무를 10번찍으면 나무 넘기기 
	
	public static void tree() {
		// 나무를 찍기 전이기 때문에 공격 0
		int hit = 0;
		
		while(hit < 10) {
			//나무를 몇번 찍었는지 확인
			hit++; // 나무 1번 찍을 때마다 hit = hit + 1;
			System.out.println("나무를 " + hit + " 번 찍었습니다.");
			//만약에 나무를 공격한 수가 10번이 되면  나무 넘어갑니다 표현
			if(hit == 10) {
				System.out.println("나무가 넘어갑니다~~!!!!! 성공~~!!!");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//method1();
		//kh카페();
		//getMoney();
		//allNumber();
		tree();
	}

}








