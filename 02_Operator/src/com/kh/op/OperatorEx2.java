package com.kh.op;

import java.util.Scanner;

// class �ٱ����� package�� import �� �ۼ��� �� ����
// �̿� �����ڰ� �����ϰ��� �ϴ� ������ class ���ο� �ۼ��������
public class OperatorEx2 {
	//1. �޼��� : ��ĳ�ʸ� ������� �ʴ� �޼���
	public static void �޼���1() {
		int num1 = 20;
		int num2 = 5;
		int ���ϱ� = num1 + num2;
		int ���� = num1 - num2;
		int ���ϱ� = num1 * num2;
		int ������ = num1 / num2;
		System.out.println("���ϱ� : " + ���ϱ�);
		System.out.println("���� : " + ����);
		System.out.println("���ϱ� : " + ���ϱ�);
		System.out.println("������ : " + ������);
	}
	
	public static void �޼���2() {
		double num3 = 1.4;
		double num4 = 2.5;
		
		// double ���ϱ� ���� ���ϱ� �����⸦ ��������
		double sum = num3 + num4;
		double sub = num3 - num4;
		double mul = num3 * num4;
		double div = num3 / num4;
		
		System.out.println("sum : " + sum);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
	}

	// �޼��� 3 () -> Scanner 
	// �޼��� ���� �ִ� () ���߿� � ���� ���� �� ���
	// ���� ���� ���� ������ () ��������� ����
	public static void �޼���3() {
		Scanner sc = new Scanner(System.in);
		//Ű����� �ۼ��� ���ڰ� num5�� ���� �� �ְ� ���� ����
		int num5 = sc.nextInt();
		//Ű����� �ۼ��� ���ڰ� num6�� ���� �� �ְ� ���� ����
		int num6 = sc.nextInt();
		
		//Ű����� ���޹��� ���ڸ� ���ϱ� ���� ���ϱ� ������ �� �� ����
		int sum1 = num5 + num6;
		int sub1 = num5 - num6;
		int mul1 = num5 - num6;
		int div1 = num5 / num6;
		
		System.out.println("sum1 : " + sum1);
		System.out.println("sub1 : " + sub1);
		System.out.println("mul1 : " + mul1);
		System.out.println("div1 : " + div1);
	}
	
	//���� ���� ���� �޼���
	public static void main(String[] args) {
		//������ ���� �޼��� �߿���
		//����ϰ� ���� �޼��常 �ۼ��� ��
		
		//���࿡ �޼���1() �ȿ� �ۼ��� ������ ����ϰ� �ʹٸ� 
		//�޼���1(); �̶�� �ۼ� �� ����ϸ� ����
		�޼���1();
		�޼���2();
	}

}










