import java.util.Scanner;

//			Va   ri   ab   le   Sc   an 
public class VariableScan {

	public static void main(String[] args) {
		//����ڿ��� �Է¹��� ������ ����
		//Scanner�� �̿��ؼ� �Է¹��� ������ ��ǻ�Ϳ� ǥ������
		//System.in ����ؼ� Ű���� �Է��� �о�� �� ���
		// Scanner �ڷ��� �ڸ��� int�� String�̳� �Ǽ� boolean����
		// Ȯ����� ��Ÿ�� �� ���� ������ �ʱ⿡�� Scanner��� ���
		// nextLine() : ���� �Ǵ� ���͸� ġ�� �������� ���� ��ü�� �Է� �޴´�.
		// �Էµ� ���ڸ� ��� �� �����´�. (����, Ư������ �� ��� ������)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� �̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("������� ��� ���� �Է��ϼ���.");
		String live = sc.nextLine();
		System.out.println(live);
		
		System.out.println("������� �ڵ�����ȣ�� �Է��ϼ���.");
		String phoneNumber = sc.nextLine();
		System.out.println(phoneNumber);
		
		//Scanner String�� ����ؼ�
		// ������� Ű, ������� ����, ������� �г����� �Է¹ޱ�
		
		// ������� Ű String height
		System.out.print("������� Ű�� �Է��ϼ��� : ");
		String height = sc.nextLine();
		System.out.println(height);
		
		// ������� ���� String age
		System.out.print("������� ���̸� �Է��ϼ��� : ");
		String age = sc.nextLine();
		System.out.println(age);
		
		// ������� �г��� String nickName
		System.out.print("������� �г����� �Է��ϼ��� : ");
		String nickName = sc.nextLine();
		System.out.println(nickName);
		
	}

}





