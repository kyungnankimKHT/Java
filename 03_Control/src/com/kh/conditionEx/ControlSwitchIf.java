package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {
	
	public static void takeAtaxi() {
		// 입력받은 돈이 3000원 이상일 경우에만 택시를 탈 것인지 물어볼 것
		Scanner sc =  new Scanner(System.in);
		System.out.print("현재 보유하고 있는 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		// if 문을 사용해서 금액이 3000원 이상일 경우에만 물어보는 코드를 작성 해줄 것
		if(money >= 3000) {
			System.out.println("택시를 탈까요? (예/아니오)");
			String answer = sc.next();
			
			// answer로 받은 대답에 따라 응답을 처리하기
			switch (answer) {
				case "예" :
					System.out.println("택시를 탔습니다.");
					break;
				case "아니오" :
					System.out.println("택시를 타지 않습니다.");
					break;
				default :
					System.out.println("잘못된 입력이 아닙니다.");
			}
			
		}else {
			System.out.println("3000원 이하이므로 잔액이 부족합니다.");
		}
	}

	
	public static void main(String[] args) {
		takeAtaxi();

	}

}
