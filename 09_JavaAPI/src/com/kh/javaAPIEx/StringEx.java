package com.kh.javaAPIEx;

/*
String : 문자열을 나타내는 클래스
 		 문자열을 생성하고 조작하는데 사용
 		 
 String str = new String();  -String에서  이 방식은 사용하지 않음
 String str = "";
 
 코딩테스트나 문자를 자르고 변경할 때 사용하는 메서드를 작성
 substring = 내가 시작하고 싶은 숫자부터 끝내고 싶은 숫자값을 지정해서 변경할 수 있음
 substring(시작숫자,끝나는숫자) = 인덱스
 substring(시작숫자) 		    = 시작숫자부터 끝나는 숫자까지 모두 변경하거나 사용
 
 toUpperCase() = 원하는 문자열을 모두 대문자로 변환
 toLowerCase() = 원하는 문자열을 모두 소문자로 변환
 		trim() = 원하는 문자열의 앞 뒤 공백을 모두 제거해서 리턴
  
*/




public class StringEx {

	public static void main(String[] args) {
		
		//String str = new String();
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		
		//가비지 컬렉션
		//코딩에서 사용하고 사용되지 않는 것을 자동으로 없애는 것
		//Garbage 쓰레기 -> 사용되지 않아 그럼 필요가없네?
		// 버리자!
		String phone = "010";
		phone += "1234-5678";
		System.out.println(phone);
		/*
					    0 1 2 3 4 5 6 7 8 9 10 11
		String 문자열 = " H e l l o   W o r l d  !";	
		*/
		String 문자열 = "Hello World!";
		
		// 1. subString()
		String 서브스트링 = 문자열.substring(6);
		System.out.println(서브스트링);
							// 6부터 7까지만 보여준다는 의미
		String 서브스트링1 = 문자열.substring(6 ,8);
		System.out.println(서브스트링1);
		
		// 2. toUpperCase()
		String 대문자 = 문자열.toUpperCase();
		System.out.println("대문자 맞나요 ? " + 대문자);
		// 3. toLowerCase()
		
		// 4. trim()

	}

}







