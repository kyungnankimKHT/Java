package com.kh.oop.method.oop;

public class DrinkStore {
//필드
	private DrinkMaker maker;
	private String location;
	private String name;
	private boolean takeout; //ok

	//메서드
	//setter
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	//getter
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public boolean isTakeout() {
		return takeout;
	}
	//생성자 : 기본
	public DrinkStore() {
		
	}
	//생성자 : 필수 maker location name takeout
	public DrinkStore(DrinkMaker maker, String location, String name,boolean takeout) {
		this.maker = maker;
		this.location = location;
		this.name = name;
		this.takeout = takeout;
	}
	public void orderDrink () {
		System.out.println(location + " " + name +" 에 주문한 정보");
		// 제조 음료 확인
		maker.makeDrink();
		if(takeout) {
			System.out.println("테이크아웃 주문");
		} else {
			System.out.println("매장에서 섭취");
		}
	}

}






