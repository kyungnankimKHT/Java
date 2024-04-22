package com.kh.hw.person.view;

import java.util.Scanner;

public class PersonMenu {
	//사용자한테 숫자를 입력받고
	Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("=== 메인메뉴 ===");
			System.out.println("1. 학생 메뉴");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴선택 : ");
			int choice = sc.nextInt();
			sc.nextLine(); // 남아있는 enter 없애기
			
			//번호를 선택할 수 있는 switch 소환
			switch(choice) {
			case 1:
				studentMenu();
				//break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
	
	//학생을 추가하거나 조회할 것
	public void studentMenu() {
		while(true) {
			System.out.println("=== 학생 메뉴 ===");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 출력");
			System.out.println("0. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				insertStudent();
				break;
			case 2:
				//학생출력하기;
				break;
			case 0:
				System.out.println("이전 메뉴로 이동합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			
			}
		}
	}
	

	public void insertStudent() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("신장 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("전공 : ");
		String major = sc.nextLine();
		
		System.out.println("학생이 추가되었습니다.");
	}
}


















