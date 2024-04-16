package com.kh.oop.constructor;
/* 생성자 
변수를 원하는 값으로 초기화할 수 있음

초기값이 = 0; 으로 되어있을 때 초기값에 1을 넣어주면
초기값이 1로 초기화됨

1. 반환값이 없음(return 사용 x, void x 위 두 개로 선언하지 않음)
2. 객체(클래스)를 초기화 하는 방법이 많을 경우 모두 사용 가능
	
	선언 예제
		1. 기본 생성자 - 필수가 없음
			public 클래스이름() {
			
			}
		2. 필수 생성자 - 필수로 받아야하는 값이 존재함
					 - 필수로 받아야하는 값은 필드에 적힌 값만 가능
			public 클래스이름(String ㅇㅇ, int ㅁㅁ, char ㅎㅎ){
				(여기서 변수명과 필드값은 같음)
				this.변수명1 = ㅇㅇ;
				this.필드값2 = ㅁㅁ;
				this.필드값3 = ㅎㅎ;
			}
		3. 값이 지정된 생성자
			필드나 생성자에서 값을 지정해준 생성자

* */
public class ConstructorEx {
	//필드 변수명 정의
	public String name;
	public String phone;
	public    int idNo;
	public    int money;
	
	//생성자 기본  / 필수 / 값을 지정한 생성자
	// 기본생성자
	//public ConstructorEx() {
		
	//}
	// 필수생성자 괄호 안에 매개변수가 필수로 들어가야하는 생성자
	// 媒 매(중매) 介 개(개입)  變 변(변하다) 數 수(숫자가)
	//					( 괄호안에 들어가는 변수 매개 변수 )
	
	
	public ConstructorEx() {
		
	}
	
	//                  필수로 이름
	public ConstructorEx(String inputName) {
		this.name = inputName;
	}
	//					필수로 이름 핸드폰번호
	public ConstructorEx(String inputName, String inputNumber) {
		this.name = inputName;
		this.phone = inputNumber;
	}
	
	//					필수로 이름 핸드폰번호 아이디번호
	public ConstructorEx(String inputName, String inputNumber,int inputID) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputID;
	}
	
	public ConstructorEx(int inputID, String inputName, String inputNumber) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputID;
	}
	public ConstructorEx(String inputName ,int inputID , String inputNumber) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputID;
	}
	
	
	
	
	//아이디 이름 비밀번호 비밀번호확인 이메일 주소
	//
	
	
	//					필수로 이름 핸드폰번호 아이디번호 금액
	public ConstructorEx(String inputName, String inputNumber, int inputId, int inputMoney) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputId;
		this.money = inputMoney;
	}
	
	
	
	
	
	
	public static void main(String[] args) {

	}

}
