package com.kh.op;

import java.util.Scanner;

public class OperatorPre2 {
	
	public static void method1() {
		//스캐너로 입력한 값이 true인지 false 인지 해볼 것
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값을 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("b의 값을 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.println("a : " + a + ", b : " + b);
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
	}
	
	public static void main(String[] args) {
		// 최종으로 출력할 메서드만 작성
		method1();

	}

}
