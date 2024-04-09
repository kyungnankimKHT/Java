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
					System.out.println("�߸��� �Է��Դϴ�.");
			}
			
		}else {
			System.out.println("3000�� �����̹Ƿ� �ܾ��� �����մϴ�.");
		}
	}
	/* public static void whyScore
	 * ����ڷκ��� ������ �Է¹޾� ���� ����� �Ǻ��ϴ� ���α׷� �ۼ�
	 * int score
	 * String reScore
	 * if 
	 *  90 �̻��� ��� A ����
	 *  80 �̻��� ��� B ����
	 *  70 �̻��� ��� C ����
	 *  60 �̻��� ��� D ����
	 *  60�� �̸��� ��� F ����
	 * switch 
	 *   -> F ������ �� ����� �Ͻðڽ��ϴ� (yes / no)
	 *   ���࿡ Yes NO �̿��� ���� ���� �� �ֱ� ������ 
	 *   case YES : case yes: 
	 * */
	
	public static void whyScore() {
		
		// ��ĳ�� �̿��ؼ� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt(); //Ű����� ���� �Է¹ޱ�
		
		if(score >= 90) {
			System.out.println("A����");
		} else if (score >= 80) {
			System.out.println("B����");
		} else if (score >= 70) {
			System.out.println("C����");
		} else if (score >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
			System.out.print("����� �Ͻðڽ��ϱ�? (yes / no) : ");
			String reScore = sc.next();
			
			//������� ���θ� Ȯ���ϱ�
			switch(reScore) {
			case "YES": case "yes" :
				System.out.println("����� ��û�� �Ϸ�Ǿ����ϴ�.");
				break;
			case "NO" : case "no" :
				System.out.println("����� ��û�� ���� �ʾҽ��ϴ�.");
				break;
			default:
				System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
			}
		}
	}

	/* public static void whatDay
	 * �� �� �� : �ｺ
	 * ȭ �� : ����
	 * �� �� : �ָ��ε� ������ �� �����Դϱ�? (�� / �ƴϿ�)
	 * 	���࿡ ������ �� �����̸� �� ������ �� �����Դϴ�.
	 * 		�ƴϿ� �����ϸ� � Ȱ���� �� �������� �������ּ���.
	 * 			Ȱ�� 1. ��� 2. ���� 3. ���� ������ �� �ְ� �������
	 * */
	
	public static void whatDay() {
		//������ � �������� Ȯ���� �Ŀ� ���Ͽ� ���� ����� ������ ��
		Scanner sc = new Scanner(System.in);
		System.out.println("��¥�� �Է����ּ��� : ");
		System.out.print("(�� / ȭ / �� / �� / �� / �� / ��) : ");
		String day = sc.next();
		
		String result = "";
		switch(day) {
			case "��":  case "��":  case "��" :
				result = "�ｺ";
				break;
			case "ȭ": case "��":
				result = "����";
				break;
				/*���࿡ ������ �� �����̸� �� ������ �� �����Դϴ�.
				 �ƴϿ� �����ϸ� � Ȱ���� �� �������� �������ּ���.
				 Ȱ�� 1. ��� 2. ���� 3. ���� ������ �� �ְ� �������*/
			case "��": case "��":
				System.out.println("�ָ��̳׿�.");
				System.out.print("������ �� �����ΰ���? (�� / �ƴϿ�) : ");
				String answer = sc.next();
				if (answer.equals("��")) {
					result = "��";
				} else { //������ �� ������ �ƴ� ���
					System.out.println("� Ȱ���� �� ��ȹ�ΰ��� ?");
					System.out.print("1.��� / 2.���� / 3.����) : ");
					int activity = sc.nextInt();
					switch (activity) {
					case 1:
						result = "���";
						break;
					case 2:
						result = "����";
						break;
					case 3:
						result = "����";
						break;
					default:
						System.out.println("�߸��� �Է�");
						return;
					}
				}
			break;
		default :
			return;
		}
		
		System.out.println(day +"���Ͽ� " + result +"�� ����" );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//takeAtaxi();
		whatDay();
	}

}
