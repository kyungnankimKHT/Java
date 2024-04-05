package com.kh.variable.ex;

public class VariableEx2 {
	//메인 메서드 (프로그램 실행)
	public static void main(String[] args) {
	/*
	  컴퓨터에서 계산을 할 때 값 처리 원칙
	  -같은 자료형끼리 연산, 결과도 같은 자료형
	  
	  만약에 
	  다른 자료형 끼리 연산하는 경우 자료형을 맞게 변환
	  
	  자동 형변환
	  - 연산 시 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환
	 */
		
	//자동 형변환 확인1
	int num1 = 9;
	//1,000원
	long num2 = 10_000_000_000L; //100억
	//result = 결과 
				//int와 long 을 더해서 총 100억 9원
	long result = num1 + num2;
	
	System.out.println("더한 결과 :" + result + "원");
		
		
	}

}




