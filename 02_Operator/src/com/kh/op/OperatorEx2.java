package com.kh.op;

//메서드 : 특정 상태나 기능을 정리해놓은 집합

public class OperatorEx2 {
	//1. 메서드 : 스캐너를 사용하지 않는 메서드
	public static void 메서드1() {
		int num1 = 20;
		int num2 = 5;
		int 더하기 = num1 + num2;
		int 빼기 = num1 - num2;
		int 곱하기 = num1 * num2;
		int 나누기 = num1 / num2;
		System.out.println("더하기 : " + 더하기);
		System.out.println("빼기 : " + 빼기);
		System.out.println("곱하기 : " + 곱하기);
		System.out.println("나누기 : " + 나누기);
	}
	//최종 제출 메인 메서드
	public static void main(String[] args) {
		//앞으로 만든 메서드 중에서
		//출력하고 싶은 메서드만 작성할 것
		
		//만약에 메서드1() 안에 작성한 내용을 출력하고 싶다면 
		//메서드1(); 이라고 작성 후 출력하면 가능
		메서드1();
	}

}










