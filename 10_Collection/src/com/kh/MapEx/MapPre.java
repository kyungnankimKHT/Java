package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	//기본생성자 ctrl space enter
	public MapPre() {
	}
	//void 메서드 생성
	public void practice1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시쉬림프");
		System.out.println(map);
	}
	
	public void practice2() {
		//									<> 자료형 넣어도 되고 안 넣어도 됨
		Map<String,String> map = new HashMap<String,String>();
		// map.put 을 활용해서  학원-서울시 강남구 등산-서울시 관악구 롯데타워 서울시-송파구
		
		// 전체출력 System.out.println();
		
		// get 이용해서 롯데타워가 어디 있는지 출력
		
		// remove 활용해서 등산 삭제하기
		
		// for-eact keySet()을 활용해서 전체 목록 출력하기
	}
	
	
	
	//최종 메인메서드
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		mp.practice1();
	}
}
