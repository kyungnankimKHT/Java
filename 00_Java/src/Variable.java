
public class Variable {

	public static void main(String[] args) {
		// 1.���� 2.���� 3.���ڿ� 4.�Ǽ� 5.����
		//1. ���� byte short int long
		// byte = 1byte 
		byte ����Ʈ = 1;
		System.out.println(����Ʈ);
		System.out.println("����Ʈ");
		//������ ������ �� Ű���忡�� ctrl + s �� �����ָ� �����
		byte bt = 2;
		System.out.println(bt);
		
		short ��Ʈ = 3;
		System.out.println(��Ʈ);
		
		int ��Ʈ = 1;
		System.out.println(��Ʈ);
		
	// byte �ڷ��� ���� �����̸� bte bte �ȿ� ���� 2 �ְ� ����ϱ�
		byte bte = 2;
		System.out.println(bte);
		
	// short �ڷ��� ���� �����̸� shrt shrt �ȿ� ���� 2 �ְ� ����ϱ�
		short shrt = 2;
		System.out.println(shrt);
		
	// int �ڷ��� ���� �����̸� nt nt �ȿ� ���� 2 �ְ� ����ϱ�
		int nt = 2;
		System.out.println(nt);
		
	// long �ڷ��� ���� �����̸� lng lng �ȿ� ���� 2 �ְ� ����ϱ�
		long lng = 2;
		System.out.println(lng);
		
	// 2. ����
	//���ڿ��� char�� String�� ����
		// ���ڸ� ��Ÿ���� char�� '' ���� ����ǥ�� ����ؼ� ǥ��
		// " " ū ����ǥ�� String ���ڿ��� ��Ÿ���� ǥ��
		
		char myChar = 'A';
		System.out.println(myChar);
		
		//char myChar2 = "A";
		//System.out.println(myChar2);
		//char ���� �ϳ��� ���ڸ� ���� �� �ֱ� ������ 
		// A�� B �� �� �ϳ��� �ۼ� ����
		/*
		 * char myChar3 = 'AB';
		 * char myChar4 = 'ABC';
		 * char myChar5 = '������';
		 * ��� ���ڰ� �ϳ��� �ƴϱ� ������ ����� �� ����
		 * */
		
		//String
		String str1 = "�� ���� ���ڴ�~~";
		System.out.println(str1);
		// String �� ����ؼ� ������ �̸� ����ϱ�
		
		//String name = "������ �̸�";
		//System.out.println(name);
		String name = "��泭";
		
		System.out.print("����� �̸��� ");
		System.out.println(name);
		System.out.println("�Դϴ�.");
		
		//���࿡ ���� ���ڳ� ������ ���ٷ� ����ϰ� �ʹٸ�
		// + �� ����ؼ� �̾ ����� �� ����
		System.out.println("����� �̸���"+name+"�Դϴ�.");
		
		// ���ϴ� �� ����� �̸��� ������ �Դϴ�.
		System.out.println("����� �̸���" + name +    "�Դϴ�.");
		System.out.println("����� �̸���   " + name + "   �Դϴ�");
		System.out.println("�� �� �� �� �� �� "+name+" �� �� ��.");
		// ���⸦ �ְ� ���� ��� "" ū ����ǥ ���ο� ���⸦ �־�� ��
		
		// ���� + ���� + ���ڿ� ����ϱ�
		/*
		 �ȳ��ϼ���. ���¿�. ���￡ ��� ������ �Դϴ�.
		 �� ��ȭ��ȣ�� 111-2222-3333 �Դϴ�.
		 �� �ֹι�ȣ�� ����Դϴ�.
		 �� �������� A���Դϴ�.
		 * */
		String geeting = "�ȳ��ϼ���.";
		String introduction = "���¿�. ���￡ ��� ooo �Դϴ�.";
		String number = "111-2222-3333";
		String secret = "���";
		String bloodType = "A��";
		
		System.out.print(geeting);//�ȳ��ϼ���.
		System.out.println(introduction);
		System.out.print("�� ��ȭ��ȣ�� ");
		System.out.print(number);
		System.out.println(" �Դϴ�.");
		System.out.println("�� �ֹι�ȣ�� "+secret+" �Դϴ�.");
		//�� �������� A���Դϴ�.
		System.out.println("�� �������� "+bloodType+" �Դϴ�.");
		
		//4.�Ǽ� 5.����
		// �Ǽ��� float �� double �� ����
		// �Ǽ��� �⺻���� double �������� �Ǿ�����
		// float = 4byte  double = 8byte
		// float�� �Ǽ��� ��� ���ؼ��� f�� �ٿ���� ��
		// �Ǽ� �ڿ� f�� ���� �� �� �ҹ��� ���� ���� ��� ����
		float ff1 = 3.14f;
		float ff2 = 3.14F;
		System.out.println("ff1 �� : " + ff1 + " �̴�.");
		System.out.println("ff2 �� : " + ff2 + " �̴�.");
		//double�� ũ�Ⱑ float ���� ũ�� ���ʿ� double�� ������ �߱� ������
		// �ڿ� �ٸ� ������ ������ �ʾƵ� ����� �� ����
		double dd1 = 3.14;
		System.out.println("double dd1 : " + dd1);
		
		//5.����
		//boolean�� ����ؼ� true���� false���� ǥ���� �� ����
		// ���߿� �˰����̳� if for while ���� ����� �� ���� ���
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("���� ������ " + isTrue);
		System.out.println("���� ������ " + isFalse + " ?");
		
		//���� ���� ���ڿ� �Ǽ� ����
		
		
		char ch = 'Z';
		System.out.println("���� ch �� �� = " + ch);
		
		String text = "Hello, World!";
		System.out.println("���ڿ��� text = " + text);
		
		double dbl = 3.14;
		System.out.println(dbl);
		
		boolean isTrue2 = true;
		System.out.println("isTrue2 = " + isTrue2);
		
		
		//System.out.println(" num  = " + num);
		
		// num ���ٰ� 10 ��� 20�� �ְ� �ʹٸ�?
		int ���� = 10;
		System.out.println("������ �� = " + ����);
		
		//�������� ó�� 1ȸ�� ����� �� 
		// ������ �ٸ� ���ڳ� ���� ���� ����
		// �������� �����Ѵ�
		���� = 20;
		System.out.println("20���� ������ ������ �� : " + ����);
		
		/*
		 ö���� 19���̾���.
		 �׷��� 24���� �Ǹ鼭 20���� �Ǿ���.
		 * */
		String name1 = "ö��";
		String age = "19";
		System.out.println(name1 + "�� " + age + "���̾���.");
		age = "20"; //age ���� 20���� ����
		System.out.println("�׷��� 24���� �Ǹ鼭 " + age + "���� �Ǿ���.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("");
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");
		System.out.println("");System.out.println("");System.out.println("");
		System.out.println("");
		System.out.println("");System.out.println("");System.out.println("");
	}
}















