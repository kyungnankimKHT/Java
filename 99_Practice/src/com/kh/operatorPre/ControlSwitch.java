package com.kh.operatorPre;

public class ControlSwitch {
	/*
	 switch / case 
	   if문과 비슷하지만 형식이 일정하게 있는 조건 판단문
	   
	  사용 방법
	  switch(입력변수) {
	  	case 입력값1 :
	  		실행할 문장
	  		break; // case를 빠져나가기 위한 제어장치
	  		
	  	case 입력값2 :
	  		실행할 문장
	  		break; // 만약에 break가 없다면 다음 case를 실행할 것
	  	
	  	... 
	  	
	  	default :  // 입력변수와 일치하는 값이 없을 때 실행되는 옵션
	  			  //  선택 사항이며 필요에 따라 생략할 수 있음
	  			 //   else 와 비슷한 행위를 진행함
	  		실행할 문장
	  		break;
	  }
	*/
	

	public static void main(String[] args) {
		int day = 3;
		String dayString ;
		
		switch (day) {
			//조건에 해당하는 case를 작성
		case 1:
			dayString = "일요일";
		case 2 :
			dayString = "월요일";
		case 3 :
			dayString = "화요일";
			//break;
		case 4 :
			dayString = "수요일";
		default :
			dayString = "잘못된 입력";
		}
		
		System.out.println("입력한 숫자는 " + dayString + " 입니다.");
	}

}







