package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {
	
	public static void takeAtaxi() {
		// �Է¹��� ���� 3000�� �̻��� ��쿡�� �ýø� Ż ������ ��� ��
		Scanner sc =  new Scanner(System.in);
		System.out.print("���� �����ϰ� �ִ� �ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		
		// if ���� ����ؼ� �ݾ��� 3000�� �̻��� ��쿡�� ����� �ڵ带 �ۼ� ���� ��
		if(money >= 3000) {
			System.out.println("�ýø� Ż���? (��/�ƴϿ�)");
			String answer = sc.next();
			
			// answer�� ���� ��信 ���� ������ ó���ϱ�
			switch (answer) {
				case "��" :
					System.out.println("�ýø� �����ϴ�.");
					break;
				case "�ƴϿ�" :
					System.out.println("�ýø� Ÿ�� �ʽ��ϴ�.");
					break;
				default :
					System.out.println("�߸��� �Է��� �ƴմϴ�.");
			}
			
		}else {
			System.out.println("3000�� �����̹Ƿ� �ܾ��� �����մϴ�.");
		}
	}

	
	public static void main(String[] args) {
		takeAtaxi();

	}

}
