package com.kh.op;

import java.util.Scanner;

public class OperatorEX {
	//���� �޼��� ȣ��
	public static void main(String[] args) {
		//int a = 1;
		//int b = 3;
		//���� ��ĳ�ʷ� �Է¹��� ���� ��µǰ� �غ��ô�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�ȳ��ϼ���. �����Դϴ�.");
		System.out.print("a���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		System.out.print("b���� �Է��ϼ��� : ");
		int b = sc.nextInt();
		
		//����
		int sum = a+b;
		System.out.println("���� ��� sum : " + sum);
		//����
		int dif = a-b;
		System.out.println("���� ��� dif : " + dif);
		//����
		int mul = a*b;
		System.out.println("���� ��� mul : " + mul);
		//������
		int div = b/a;
		System.out.println("������ ��� div : " + div);
		
	}

}






