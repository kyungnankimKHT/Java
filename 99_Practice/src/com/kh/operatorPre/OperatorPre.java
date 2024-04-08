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
		//��ĳ�ʷ� char ���� �Է¹ް��� �� ��쿡��
		//charAt �� ����ؼ� ���ڿ� ��ġ�� �о���� �۾��� �����ؾ���
		//�ý������� ���� ���
		//System  - out  - print()
		//Scanner - next - charAt(���ڸ�����)
		//                       ���� �������ϴ� ���� ��ġ
		// T     A     B    L     E  = 5����
		// ���࿡ �� �ձ��ڸ� ���� �ʹٸ�
		// charAt(0) : ��  �� ���ڸ� ����
		// charAt(1) : �ι�° ���ڸ� ����
		// charAt(2) : ����° ���ڸ� ����
		// charAt(3) : �׹�° ���ڸ� ����
		// charAt(4) : �ټ���° ���ڸ� ����
		// TABLE�� ��� �� 5�����̱� ������ 
		// chatAt ������ 4������ �ۼ��� �� ����
		
		System.out.print("����(M/F) : ");
		//String gender = sc.next();
		char gender = sc.next().charAt(0);
		// � ���ڰ� ������ ������� �� �տ��ִ� ���ڸ�
		// �ʿ��ϱ� ������ 0���� �ۼ�
		// ���� �Է� �ޱ� (�Ҽ��� ��° �ڸ� ������ �Է¹���)
		System.out.print("���� : ");
		double score = sc.nextDouble(); //��ü�ڸ� �Է¹���
		// ������ ���� ��� ���ڿ� ����
		// ���� ������ ��� ���ڿ� ����
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("  �� : " + classNum);
		System.out.println("��ȣ : " + num);
		System.out.println("���� : " + gender);
		//System.out.println("���� : " + score);
		
		//printf + ,
		//printf �� %f �� ����� ���� �Ҽ��� �ڸ��� �������൵ �ǰ�
		// ���������� �ʾƵ� �ȴ�.
		//�ٸ� ���࿡ �Ҽ��� �ڸ� ��ġ�� �����ؼ� ����ϱ� ���Ѵٸ� 
		// %  .����� ���ϴ� �Ҽ��� ��ġ�ڸ� �� f
		// ������� �Ҽ��� 4��° �ڸ����� ����ϱ� ���� : %.4f
		// ������� �Ҽ��� 5��° �ڸ����� ����ϱ� ���� : %.5f
		
		// �Ҽ��� 2��° �ڸ����� ����ϱ� ���Ѵٸ� %.2f
		System.out.printf("���� :  %.2f" , score);
		
		
		
	}
	
	/*
	����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�, 
		�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
		(���� + ���� + ���� ) /3.0
	 */
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		// ���� ���� �Է�
		System.out.print("���� ������ �Է��ϼ��� : ");
		int korean = sc.nextInt();
		// ���� ���� �Է�
		System.out.print("���� ������ �Է��ϼ��� : " );
		int english = sc.nextInt();
		// ���� ���� �Է�
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math = sc.nextInt();
		
		// �Է¹��� ������ �հ� ���
		// �������� = ��������  + �������� + ��������;
		int total = korean + english + math;
		
		//�� ���� ������ 3 �� �ؼ� ��� ���� ����ϱ�
		// ������ ������ �Ҽ��� �̿� ������ ���´ٴ� ������ ���� ������
		// �Ǽ�(�Ҽ����ڸ��� �ִ� ��) �� ���´ٴ� ������ ����
		// 64             32
		double average =  (double)  total / 3.0;
		System.out.println("�������� : " + korean);
		System.out.println("�������� : " + english);
		System.out.println("�������� : " + math);
		System.out.println("���� + ���� + ���� : " + total);
		System.out.println("���� ���� ���� ������� : " + average);
		
	}
	
	//2���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������
	//true �ƴϸ� false ���
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		// ù ��° �� �Է¹ޱ�
		System.out.print("ù ��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		// == true  == ���ʿ� �ִ� ���� ������ true
		//  3 == 5 false ��� ǥ��
		//  5 == 5 true ��� ǥ��
		// != ���ʿ� �ִ°��� �ٸ����� �ٸ��� �¾�! true
		//  3 != 5 true ��� ǥ��
		//  3 != 3 false ��� ǥ��
		// true false ǥ���� �� �� ���� true false�� ǥ���ޱ� ���ؼ���
		// boolean �� ����ؼ� ǥ���� ��
		// ���� ���� ��� ���� =  true or false;
		// = equal
		   boolean result  = num1 == num2 ;
		   System.out.println("num1 == num2 : " + result);
	}
	
	/* �ǽ����� 4�� ����
	2���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� �ٸ��� !=
								  true ��� ������ false ���
	*/
	public static void practice4() {
		//��ĳ�� �̿��ؼ� num1 num2 �� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1 �� ���� �Է��ϼ��� : " );
		
		int num1 = sc.nextInt(); //������ num1 ���� ����
		
		System.out.print("num2 �� ���� �Է��ϼ��� : ");
		
		int num2 = sc.nextInt();
		// ��� �ٸ��� !=
		// boolean �� ����
		boolean result = num1 != num2; //�� �� ���� �ٸ��� ��!
		System.out.println("num1 �� �� : " + num1);
		System.out.println("num2 �� �� : " + num2);
		System.out.println("num1 != num2 : " + result);
		
		
	}
	
	
	// practice5 ��!
	// 3���� ���� Ű����� �Է� �޾�  ��!
	// �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ���
	public static void practice5() {
		// ��ĳ�� ����ؼ� 
		Scanner sc = new Scanner(System.in);
		// int �� ������ 3�� �����
		System.out.print("num1 �� ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("num2 �� ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.print("num3 �� ���� �Է��ϼ��� : ");
		int num3 = sc.nextInt();
		
		//  ampersand   &&   and  
		//   ����1   &&  ����2  = true
		//  (true)  && (true) = true
		//  (true)  && (false) = false
		//  (false) && (true) = false
		//  (false) && (false) = false
		//								�� + ���� Ű���� : ����
		//                                ��  true  ��   
		//               num1�̶� num2�� ���� �� && num2 �� num3�� ���� ��
		boolean result =       (num1 == num2) && (num2 == num3);
		System.out.println("num1 : " + num1 + ", num2 : " + num2 + ", num3 : " + num3);
		System.out.println("result : " + result);
	}
	
	
	
	
	
	
	
	//���� �޼��� : �������� �����ϴ� �޼���
	public static void main(String[] args) {
		//�ۼ����� �޼��� �߿��� �����̳� ����ϰ��� �ϴ� �޼��� �ۼ� 
		//practice1();
		//practice2();
		//practice3();
		//method4();
		//practice4();
		practice5();
	}

}








