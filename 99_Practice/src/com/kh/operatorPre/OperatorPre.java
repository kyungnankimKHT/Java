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
	
	
	//���� �޼��� : �������� �����ϴ� �޼���
	public static void main(String[] args) {
		//�ۼ����� �޼��� �߿��� �����̳� ����ϰ��� �ϴ� �޼��� �ۼ� 
		practice1();

	}

}








