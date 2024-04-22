package com.kh.interfaceEx;

public class 기계실행 {
	public static void main(String[] args) {
		컴퓨터 윈도우 = new 컴퓨터();
		윈도우.전원켜기();
		윈도우.전원끄기();
		
		세탁기 돌돌이 = new 세탁기();
		돌돌이.전원켜기();
		돌돌이.전원끄기();
	}
}
