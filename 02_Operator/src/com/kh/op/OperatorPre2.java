package com.kh.op;

import java.util.Scanner;

public class OperatorPre2 {
	
	public static void method1() {
		//��ĳ�ʷ� �Է��� ���� true���� false ���� �غ� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("a�� ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		System.out.print("b�� ���� �Է��ϼ��� : ");
		int b = sc.nextInt();
		
		System.out.println("a : " + a + ", b : " + b);
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
	}
	
	public static void main(String[] args) {
		// �������� ����� �޼��常 �ۼ�
		method1();

	}

}
