package com.kh.conditionEx;

public class ConditionEx3 {
	/*
	 if ������ ������ ���� �� �ְ�, �Ǽ��� ���� �� �ְ�, ���ڿ� ���� �� ��� ���� ���� �� ����
	 ��ǥ������ ���� �񱳿� ���ڿ� �� ����
	 = �� equal
	 ���� ��
	 	if (���� == ����) {
	 		���ڿ� ���ڰ� ���� �� ������ ��¹�
	 	}
	 ���ڿ� ��   .equals
	 	if (���ڿ�.equals("���ڿ�")){
	 		���ڿ��� ���ڿ��� ���� �� ������ ��¹�
	 	}
	 
	 * */
	public static void main(String[] args) {
		//���� ��
		int number = 10;
		//���࿡ ���ڰ� 10�̶��
		if (number == 10) {
			System.out.println("���ڰ� �����մϴ�.");
		}
		
		//���ڿ� ��
		String str = "hello";
		// ���࿡ �� ���ڿ��� ���ٸ�
		if (str.equals("hello")     ) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		}
		
		String str1 = "��";
		String str2 = "";
		
		if("��".equals(str1)) {
			System.out.println("��� �� �Դϴ�.");
		}
		
	}

}












