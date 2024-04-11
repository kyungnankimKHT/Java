package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {
	
	public static void practice8() {
		// 주민번호를 이용해서 남자인지 여자인지 구분해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 - 포함해서 입력해주세요 : ");
		String idNumber = sc.next();
		//charAt 7번째 자리에 있는 값을 가지고 와서 여자인지 남자인지 구분해서 출력
		// 01234567
		// 990101-1234567 
		// 990101-2345678 
		// 000101-3456789
		// 000101-4567890
		// 주민번호 뒷자리의 첫 번째 숫자를 가지고 옵니다.
		// 주민번호를 - 제외하고 주민번호 숫자만 입력한다면 6번째 자리에 있는 값을 가지고 와야함
		char genderCode = idNumber.charAt(7);// - 포함해서 7자리
		
		// 주민버호 뒷자리 첫 번째 숫자로 성별을 판별
		String gender; //나중에 여자인지 남자인지 확인해주는 결과 보여주기

		// "" String '' char char를사용해서 숫자값을 가져오기 때문에 '' 사용
		if(genderCode == '1' || genderCode == '3') {
			gender = "남자";
		} else if (genderCode == '2' || genderCode =='4') {
			gender = "여자";
		} else {
			System.out.println("올바른 주민번호가 아닙니다.");
			//1. gender = "올바른 주민번호가 아닙니다.
			//2. else에서 돌려보내는 return
			return;
		}
		//여자인지 남자인지에 대한 결과
		System.out.println("입력한 주민번호는 " + gender + "입니다.");

	}
	
	public static void castingPractice1() {
		//키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		// 유니코드 출력 16진수 
		// 전 세계의 모든 글자나 문자를 컴퓨터에서 일관되게 표현하기 위한 방식
		// 글자에 숫자를 붙여서 컴퓨터가 읽을 수 있도록 해주는 방식
		int unicode = inputChar; //char 2byte int 4byte
		System.out.println("입력한 문자 " + inputChar + " 의 유니코드는 " + unicode + " 입니다.");
	}
	
	public static void castingPractice3() {
		//주어진 코드에서 빈칸을 채우고 출력 결과가 나오도록 만든 것
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;//기본값이 double 이기때문에 float으로 변경해주는 f 붙여줌
		double dNum = 2.5;
		char ch ='A';
		System.out.println(iNum1 / iNum2); // 2 몫 2로 떨어진다면?
		System.out.println((int) dNum); //2 
		//double 실수로 되어있는 것을 정수로 변경
		//double 8byte int 4byte 강제 형변환을 (int) 변경하겠다는 표시를 작성 후 시켜줄 것
		System.out.println((double)iNum2  * dNum); //10.0
		//작은 값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 때문에 (double) 필수가 아님
		System.out.println((double) iNum1); //10.0
		System.out.println((double) iNum1 / iNum2); // 2.5; // 정수 -> 실수형
		System.out.println(dNum);//2.5
		
		System.out.println((int)fNum); //3  // 실수형 -> 정수형
		System.out.println((int) (iNum1 / fNum) ); // 3 //나누기를 해서 몫이3
		// int와 float 은 같은  크기의 byte 정수인지 실수인지 표기
		//float 소수점 이하 6자리 까지만 보여줌 기본으로 
		System.out.println((double)iNum1 / fNum); //3.3333333
		
		System.out.println((double)iNum1 / fNum); // 3.3333333333333335
		System.out.println(ch); //'A'
		System.out.println((int)ch);// 65
		
		System.out.println((int)ch + iNum1); //75
		// 'A' 값이 (int)ch를 통해 65 
		//큰 byte와 작은 byte가 만나면 자동으로 큰 byte 담겨짐
		// 65 + (int iNum1 = 10) = 75
		
		System.out.println( (char)(ch + iNum1) ); //75 'K'
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//practice8();
		castingPractice1();
	}

}








