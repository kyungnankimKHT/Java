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
	
	public static void main(String[] args) {
		ArrayEx2 ae2 = new ArrayEx2();
		//ae2.practice1();
		//ae2.practice2();
		//ae2.practice3();
		ae2.practice4();
	}

}








