package com.kh.operatorPre;

import java.util.Scanner;

// ��Ű�� : ���� ���� Ŭ������ ����ִ� ���� ��ġ

//Ŭ���� : �����ϰ��� �ϴ� �ڵ带 �ۼ��ϴ� ����
public class OperatorPre {
	// �⺻ ��� �޼���
	// �������� ����ϴ� �޼��尡 �ƴ����� ��Ȳ�� ����
	// ���� �޼��忡�� ȣ���� ����� �� �ִ� �޼��� �� �ϳ�
	//static : �޸𸮿��� ����
	public static void practice1() {// ��� ����� ������ ���� ��������
		// ��ĳ�ʸ� �̿��ؼ� Ű����� �Է¹��� ������ ��ǻ�Ϳ� ���
		//System.in Ű����� �Է� ���� �� �ְ� ���ִ� ��� �ý���
		// Scanner : Ű����� �Է¹��� ������ ��ǻ�ͷ� ���
		// �⺻���� �������ֱ�� ������ ���̺귯������ �����;��ϱ� ������
		//import�� �̿��ؼ� ������ ��
		Scanner sc = new Scanner(System.in);
		// ��ĳ�ʸ� �ҷ��� ������ �ٷ� sc �� ��ĳ�� ����� �ҷ��͵� �Ǳ� ������
		//System.out.print �� �̿��ؼ� � �ൿ�� �����ϰ� �ִ���
		//Ȯ���ϴ� �۾��� ������ ��
		// �ο� �� �Է� �ޱ�
		System.out.print("�ο� ���� �Է��ϼ��� : ");
		int people = sc.nextInt();
		// ���� ���� �Է� �ޱ�
		System.out.print("���� ������ �Է��ϼ��� : ");
		int candies = sc.nextInt();
		
		//1�δ� ������ ���� ���� ���
		int getCandies = candies / people;
		
		//�����ְ� ���� ���� ���� ���
		int reMain = candies % people;
		// run : ctrl + f11
		//��� ���
		System.out.println("���� �ο� : " + people);
		System.out.println("ĵ�� �� ���� : " + candies);
		System.out.println("�����ϰ� �������� ĵ�� ���� : " + getCandies);
		System.out.println("���� ĵ�� ���� : " + reMain);
	}
	
	/*�̸�  �г�(���ڸ�)  ��(���ڸ�)  ��ȣ(���ڸ�) ����(M/F) ����(�Ҽ��� �Ʒ� ��° �ڸ�����) */
	public static void practice2() { //Ű����� ���� �Է¹ޱ� + �� �� Ȯ��
		//Scanner Ȱ���ؼ� Ű���� �Է¹޴� â ������ֱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�л��������α׷�");
		// �̸� �Է� �ޱ�
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		// �г� �Է� �ޱ�
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		// �� �Է� �ޱ�
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();
		// ��ȣ �Է� �ޱ�
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		// ���� �Է� �ޱ� String -> char
		System.out.print("����(M/F) : ");
		String gender = sc.next();
		// ���� �Է� �ޱ� (�Ҽ��� ��° �ڸ� ������ �Է¹���)
		double score = sc.nextDouble(); //��ü�ڸ� �Է¹���
		// ������ ���� ��� ���ڿ� ����
		// ���� ������ ��� ���ڿ� ����
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("  �� : " + classNum);
		System.out.println("��ȣ : " + num);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + score);
		
		
	}
	
	
	
	
	
	
	
	
	
	//���� �޼��� : �������� �����ϴ� �޼���
	public static void main(String[] args) {
		//�ۼ����� �޼��� �߿��� �����̳� ����ϰ��� �ϴ� �޼��� �ۼ� 
		//practice1();
		practice2();
	}

}








