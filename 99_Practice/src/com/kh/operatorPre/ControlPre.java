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
	
	public static void practice2() {
		//Ű����� ���� ���� ���� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int korean = sc.nextInt();
		
		System.out.print("�������� : ");
		int english = sc.nextInt();
		
		System.out.print("�������� : ");
		int math = sc.nextInt();
		
		// �հ�� ��� ���
		int totalScore = korean + english + math; //�հ�
		double averageScore = totalScore / 3.0;
		//�հ� ���� �Ǻ�
		//�� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���
		if(korean >= 40 && english >= 40 && math >= 40 && averageScore >= 60) {
			System.out.println("���� ���� : " + korean);
			System.out.println("���� ���� : " + english);
			System.out.println("���� ���� : " + math);
			System.out.println("��    �� : " + totalScore);
			System.out.println("��    �� : " + averageScore);
			
			System.out.println("�����մϴ�. �հ��Դϴ�!!!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		
	}

	public static void practice3() {
		
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		// Ű�� ������ �Է� �ޱ�
		System.out.print("Ű(m) �� �Է��ϼ���    : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��ϼ��� : ");
		double weight = sc.nextDouble();
		
		//BMI ��� BMI = ü�������� �񸸵��� Ȯ���ϴ� ��
		double bmi = weight / (height * height);
		
		//BMI ������ ���� ��� ���
		if(bmi < 18.5) {
			System.out.println("��ü��");
		} else if (bmi < 23) {
			System.out.println("����ü��");
		} else if (bmi < 25) {
			System.out.println("��ü��");
		} else if (bmi < 30) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		practice4();
	}

}





