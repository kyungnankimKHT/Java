package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
		
	}
	
	//문자열이 비어있을 때 예외상황 문구 만들기
	
	public int countAlpha(String s) throws CharCheckException {
		
		if(s == null  ||s.isEmpty()) {
			throw new CharCheckException("입력된 문자열이 비어 있습니다.");
		}
		
		if(s.contains(" ")) {
			throw new CharCheckException("문자열에 공백이 포함되어 있습니다.");
		}
		
		if (s.matches(".*[0-9_].*")) {
			throw new CharCheckException("체크할 문자열 안에 숫자나 밑줄이 들어있습니다.");
		}
		
		
		int count = 0 ;
		
		for(int i = 0; i <s.length(); i++) {
			char c= s.charAt(i);
			if(  (c >= 'a' && c <='z')   ||  (  c   >= 'A'  && c <= 'Z')  ) {
				count++;
			}
		}
		
		return count;
	}
}








