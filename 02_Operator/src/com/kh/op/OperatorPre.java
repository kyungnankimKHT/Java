package com.kh.op;

public class OperatorPre {
	//���� ������ִ� ���� �޼���
	public static void main(String[] args) {
		����1();
	}
	//�������� ����ϴ� �޼���� �ƴ�
	//���� �ʿ��� �� ������ ����ϴ� �޼���
	//�޼��� : Ư�� ���³� ����� �����س��� ����
	
	//static : ������ �̶�� ���� ������ ����
		//static �� �ٴ� ���� �ڷ����̳� ������ ��Ƽ� ���°� �ƴ϶�
	// �ܵ����� ���������� �޸𸮿��� ����� �� ������ ��Ÿ���� ǥ��	

	public static void ����1() {
	//public void ����1() {
		// 1. int num1 = 10 int num2 = 3
		// ���ϱ� ���� ���ϱ� ������ ����� ����ϱ�
		int num1 = 10;
		int num2 = 3;
		int ���ϱ� = num1+num2;
		int ���� = num1-num2;
		int ���ϱ� = num1*num2;
		int ������ = num1/num2;
		System.out.println("���ϱ� : " + ���ϱ�);
		System.out.println("���� : " + ����);
		System.out.println("���ϱ� : " + ���ϱ�);
		System.out.println("������ : " + ������); //10/3 = �� 3
		//3
		
		// 2. double num3 = 2.5 double num4 = 3.5
		// ���ϱ� ���� ���ϱ� ������ ����� ����ϱ�
		double num3 = 2.5;
		double num4 = 3.5;
		//�Ǽ� ����
		double sum = num3+num4;
		//�Ǽ� ����
		double sub = num3-num4;
		//�Ǽ� ����
		double mul = num3*num4;
		//�Ǽ� ������
		double div = num3/num4;
		System.out.println("sum : " + sum);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
	}
}












