package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {
	public ArrayEx2() {
		
	}
	public void practice1() {
		// for 문을 활용한 배열 출력하기
				int numbers[] = new int[10];
				
				//1 부터 4 까지 배열에 숫자를 넣기
				//index  0부터 시작하기 때문에 i = 0
				//length  = 길이	
				System.out.println("최대길이 : " +numbers.length);
				
				for(int i = 0; i <numbers.length; i++) {
					//numbers[i] = i;
					numbers[i] = i+1;
					
					//System.out.println("numbers[" + i + "] = " + i);
					System.out.println("numbers[" + i + "] = " + numbers[i]);
				}
	}
	public void practice2() {
			int numbers[] = new int[10];
			for(int i = 0; i <numbers.length; i++) {
				numbers[i] = numbers.length - i;
				System.out.println("numbers[" + i + "] = " + numbers[i]);
			}
	}
	public void practice3() {
		// 양의 정수를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int size = sc.nextInt(); //5
		
		//입력 받은 정수 크기의 배열 생성
		int[] numbers = new int[size]; //size = 5
		
		// numbers.length = size
		for(int i = 0; i < size ; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i] + " ");
		}		
	}
	//길이가 5인 String배열을 선언하고 
	//“사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
	//배열 인덱스를 활용해서 귤
	public void practice4() {
						//  0     1    2      3      4
		String[] fruits = {"사과","귤","포도","복숭아","참외"};
		System.out.println(fruits[1]);
	}
	
//	int number[] = new int[5];
//	index   0부터 마지막숫자-1    0 1 2 3 4
	//length    5 1부터 길이를 보여줌
	/*
		월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 
		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
	*/
	public void practice6() {
		//요일 생성
				// length  7
				// index  0     1    2     3    4     5    6 
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		//0부터 6까지의 숫자 입력
		System.out.print("0부터 6까지의 숫자 입력받기 : ");
		int num = sc.nextInt();
	
		//입력한 숫자가 0 ~ 6 사이에 있는지 확인 후 사이에 있다면 요일 출력
		if(num >= 0 && num <= 6) {
			System.out.println(week[num] + "요일");
		} else { 
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}
	
	
	/*
	 메소드 명 : public void practice9(){}
	길이가 7인 배열을 생성하고, 1 ~ 45까지 랜덤한 숫자값을 넣어서 출력
	 * */
	public void practice7() {
		
		//길이가 7인 배열을 생성
		int[] num = new int[7]; //index [0 1 2 3 4 5 6]  length:7
					//   num의 최종 길이를 알기 위해서 num.length 를 사용
		for(int i = 0; i<num.length; i++) {
			//랜덤으로 숫자  랜덤으로 숫자 출력하기  
			// 랜덤으로 숫자를 출력하는 방법
			// 1. Random 객체 사용 :조금 더 넓은 범위로 랜덤을 사용
			// 2. Math 객체에서 random() 메서드 사용 : 위 Random객체보다 작은 범위로 사용 가능
			
			num[i] = (int)(Math.random() * 45 + 1);//45    0 ~ 44 -> 1 ~ 45
			System.out.println(   "num[" + i + "] = "  + num[i]   );
		}
		
	}
	public void method1() {
		// 정수 0 1 2        10 20 30 출력하기
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		// 문자열 각 자리에 월 화 수 목 금 토 일 각 자리에 어떤 요일이 들어가 있는지 출력
		String str[] = {"월","화","수","목","금","토","일"};
		//for 문을 활용한 출력
		
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		
		
		
		// 실수 index 2 까지 만들어주고 출력   실수 자유
		double dbl[] = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 13.2;
		
		for(int i = 0; i < dbl.length; i++) {
			System.out.print(dbl[i] + " ");
		}
		
		
		// 문자 'A' 'B' 'C' 넣어준 다음 각 자리 출력해보기
		char chr[] = {'A','B','C'};
		
		for(int i = 0; i < chr.length; i++) {
			System.out.print(chr[i] + " ");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ArrayEx2 ae2 = new ArrayEx2();
		//ae2.practice1();
		//ae2.practice2();
		//ae2.practice3();
		//ae2.practice4();
		//ae2.practice6();
		ae2.practice7();
	}

}








