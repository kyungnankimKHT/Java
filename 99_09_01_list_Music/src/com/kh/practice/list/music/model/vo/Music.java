package com.kh.practice.list.music.model.vo;

public class Music {
//필드
	private String title;
	private String singer;
//메서드
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	//생성자 : 기본
	public Music() {
	}
	//생성자 : 필수
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

}









