package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitch2 {
	
	/*if���� Ȱ���� ������ switch�� Ȱ���� ����*/
	public static void ifExam() {
		Scanner sc = new Scanner(System.in);
		//����ڷκ��� �Է� �ޱ�
		System.out.println("1���� 3������ ���� �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result ;
		
		if (num == 1) {
			result = "��";
		} else if (num == 2) {
			result = "��";
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		
		System.out.println(num + " �� �ѱ���� " + result + " �Դϴ�.");
	}
	
	
	public static void switchExam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ѱ���� �Է����ּ���.");
		System.out.print("�Է¹��(��, ����, ����, �ܿ�) : ");
		String season = sc.nextLine();
		
		String state;
		// Switch ���� Ȱ���ؼ� ���ڿ� �� �ϰ� ����ϱ�!
		switch(season) {
			case "��" :
				state = "������";
				break;
				
			case "����" : 
				state = "�߰ſ�";
				break;
				
			case "����" : 
				state = "��ǳ��";
				break;
				
			case "�ܿ�" : 
				state = "���Ͼ�";
				break;
				
			default : 
				System.out.println("�ش��ϴ� ������ �����ϴ�.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	// if�� Ȱ���� �޼��� ���
		//ifExam();
	//switch �� Ȱ���� �޼��� ���
		switchExam();
	}

}
