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
		System.out.println("a �� b�� ������ == true�� ���� ��");
		System.out.println("a == b : " + (a == b));
		System.out.println("a �� b�� �ٸ��� != false�� ���� ��");
		System.out.println("a != b : " + (a != b));
	}
	
	//method2 �� ���� ���� ������ �� ����� ���� 
	// �񱳿����ڸ� ����ؼ� ���� ������ Ʋ���� Ȯ���غ� ��
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("c�� ���� �Է��ϼ��� : ");
		int c = sc.nextInt();
		System.out.println("�Է��� c�� ��"); 
		//���࿡ 11�� �Է��ߴٸ� c = 11
		System.out.print("d�� ���� �Է��ϼ��� : ");
		int d = sc.nextInt();
		
		int e = ++c; // c + 1 = c �ְڴ� ����� ������ c = 12
		// int f = ++c; �� �Ѵٸ� f�� ���� ��� �������� 
		//System.out.println("f : "+ f); f �� ����غ���
		System.out.println("c :" + c + ", d : " + d + ", e : " + e);
		System.out.println("c == d : " + (c == d));
		System.out.println("c == e : " + (c == e));
		
		int f = ++c ; 
		// c + 1 = c �ְڴ� ����� ������ c =12 + 1 = 13
		System.out.println("f : " + f);
		
	}
	
	public static void method3() {
// ���� ��ǥ : ��� ����� ������ ���� ������������ �Ѵ�.
		//�ο����� ���� ������ Ű����� �Է¹ޱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο����� �Է��ϼ��� : ");
		int people = sc.nextInt(); //�ο��� ���ϱ�
		
		System.out.println("���� ��Ƽ�� " + people + " ���� �����߽��ϴ�.");
		System.out.println("���� �����ϰ� �ִ� �� ������ ������ �Է��ϼ��� : ");
		int candies = sc.nextInt();
		System.out.println("���� ������ �ִ� ������ " + candies + " �� �Դϴ�.");
		
		System.out.println("�׷�����, �׷��ٸ� �����ϰ� �������� ������ ������ �� ���Դϱ�?");
		
		// �� ����� �����ϰ� �������� ������ ���� = �� ������ ���� / �� �ο� �� 
		     int                perPerson =  candies   / people;
		
		// 1�δ� �����ϰ� �������� ������ ���� ����ϱ�
		System.out.println("1�δ� �����ϰ� �������� ���� ���� : " + perPerson);
		
		//�����ְ� ���� ������ ������ ����ϱ�
		// ���� ������ ���� = �� ������ ���� % ���;
		     int  remain =  candies % people;
		     System.out.println("�������� ���� ������ ���� : " + remain);
		
	}
	

	public static void main(String[] args) {
		// �������� ����� �޼��常 �ۼ�
		//method1();
		//method2();
		method3();
	}

}
