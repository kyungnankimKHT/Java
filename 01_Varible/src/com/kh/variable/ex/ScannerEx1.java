package com.kh.variable.ex;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		/*
		 Scanner Ŭ����
		 
		 ����ڷκ��� Ű���� �Է��� �ޱ� ����
		 Java���� �����ϴ� Ŭ����
		 
		 �⺻���� �����Ǿ��ִ� ���� �ƴ�
		 import java.util ��Ű�� ǥ�⸦ ���� �� ����� �� ����
		 import ��Ȯ�� ǥ�� �� : import java.util.Scanner;
		 import �� �����´� �ǹ�
		 
		 Scanner.next() : ������� �ܾ�(String) 1�� �Է� ����
		 
		 Scanner.nextLine() : ���������ؼ� ���ڿ�(String) 1�� �Է�
		 
		 Scanner.nextInt() : int�� ���� 1�� �Է�
		 Scanner.nextLong() : long �� ���� 1�� �Է�
		 Scanner.nextDouble() : �Ǽ� 1�� �Է�
		 
		 �̿ܿ� Scanner Ŭ���� �ȿ��� �������� ����� ����
		 ��ĳ�ʴ� �ҷ��� ���� close�� ����ؼ� ������ �ݾ��ִ� ǥ�ø� ���ִ°� ����
		 */
		
		// Scanner ��� �ϱ�
		
		// 1. Ŭ���� ���� import ������ ���ܾ���
		
		// 2. Scanner ��ü ���
		Scanner sc = new Scanner(System.in);
		// 3. System.in Ű����� �Է��ϴ� ���� ���� �� �ֵ��� ��
		System.out.print("���� �Է� 1 :");
		int num1 = sc.nextInt(); // ������ �Էµ� ������ ������ num1 ����
		
		System.out.print("���� �Է� 2 :");
		int num2 = sc.nextInt(); // ������ �Էµ� ������ ������ num2 ����
		
		// �Ǽ� �Է� nextDouble�� ����ؼ� num3 ���� �Ǽ� �Է� �����
		System.out.print("�Ǽ� �Է� : ");
		double num3 = sc.nextDouble();
		
		// �ܾ� �Է� 2�� �ϱ� next ����ؼ� ������ word1 word2
		System.out.print("�ܾ� �Է� 2�� �ϱ� : ");
		String word1 = sc.next();
		// scanner �̿��ؼ� �Է��� ������ ���
		// System.out.print �� �̿��ؼ� ����� ���� �Էµƴ���
		// ������ ������ Ȯ�� ����� ���ִ� ������ �ִ� ���� ����
		String word2 = sc.next();
		

		// 4. System.out �̿��ؼ� Ű���忡 �ۼ��� ��������ϱ�
		System.out.println("���� 1�� �� : " + num1);
		System.out.println("���� 2�� �� : " + num2);
		System.out.println("�Ǽ�    �� : " + num3);
		System.out.println("�ܾ�� : " + word1 + ", " + word2);
		// 5. Scanner close ����ؼ� �ݾ��ֱ�
		
		
	}

}









