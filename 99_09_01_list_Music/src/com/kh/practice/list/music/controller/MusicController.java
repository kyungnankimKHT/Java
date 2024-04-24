package com.kh.practice.list.music.controller;

import java.util.*;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	//음악 목록 
	List<Music> list = new ArrayList<>();
	
	//음악 추가
	public int addList(String title, String singer) {
		//		Music 객체에 넣어줘야함
		//							DB 추가에 성공하면  1 실패하면 0
		//					만약에 추가성공이        ?  true : false
		return list.add(new Music(title, singer)) ?  1   :   0 ;
	}
	
	
	
	
	
	
	
	
	
	
	public int addAtZero(String title, String singer) {
		//목록에 추가하는데 맨 앞에다가 다시 새로 자리값을 만들고 
		//내가 추가하는 값이 무조건 0 자리가 될 수 있도록 추가
		list.add(0, new Music(title, singer));// ? 1 : 0;
		return 1;
	}
	//모든 음악 목록 출력
	//public printAll(){
	//
	
}









