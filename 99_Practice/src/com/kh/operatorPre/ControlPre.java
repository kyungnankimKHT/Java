package com.kh.operatorPre;

import java.util.Scanner;

/* �߶󳻱�(ctrl + x)  ����(ctrl + c) �ٿ��ֱ�(ctrl + v) */
public class ControlPre {
	//�ǽ����� 1�� Ȧ�� ¦�� ��Ÿ����
	public static void practice1() {
		// Ű����� �Է¹��� ������ ����̸鼭 ¦���� ���� ¦���Դϴ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int number = sc.nextInt(); //Ű����� ���� �Է¹ޱ�
		
		if(number > 0) { // �Է¹��� ���ڰ� ����� ��쿡�� Ȧ¦ �����ϱ�	
			if (number % 2 == 0) { //���ڰ� ¦���� ��� ����ϱ�
				System.out.println("¦���Դϴ�.");
			} else {               //���ڰ� Ȧ���� ��� ����ϱ�
				System.out.println("Ȧ���Դϴ�.");
			}
		} else { 		// �Է¹��� ���ڰ� ������ ��� ����ϱ�
			System.out.println("�����Դϴ�. ����� �Է����ּ���.");
		}
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		practice1();

	}

}





