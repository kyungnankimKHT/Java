package com.kh.variable.ex;

public class VariableEx2 {
	//���� �޼��� (���α׷� ����)
	public static void main(String[] args) {
	/*
	  ��ǻ�Ϳ��� ����� �� �� �� ó�� ��Ģ
	  -���� �ڷ������� ����, ����� ���� �ڷ���
	  
	  ���࿡ 
	  �ٸ� �ڷ��� ���� �����ϴ� ��� �ڷ����� �°� ��ȯ
	  
	  �ڵ� ����ȯ
	  - ���� �� ���� ������ ���� �ڷ����� ���� ������ ū �ڷ������� ��ȯ
	 */
		
	//�ڵ� ����ȯ Ȯ��1
	int num1 = 9;
	//1,000��
	long num2 = 10_000_000_000L; //100��
	//result = ��� 
				//int�� long �� ���ؼ� �� 100�� 9��
	long result = num1 + num2;
	
	System.out.println("���� ��� :" + result + "��");
		
		
	}

}




