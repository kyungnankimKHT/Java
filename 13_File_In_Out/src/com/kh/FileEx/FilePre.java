package com.kh.FileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {

	public FilePre() {
	}

	public void 메서드1() {
		File 텍스트파일 =  new File("c:/Users/user1/Desktop/newFFF/파일생성.txt");
		
		if(텍스트파일.exists()) {
			System.out.println("파일이 존재합니다.");
		} else { //존재하지 않는다면
			//만약에 파일 만들기 성공!
			try {
				
				
				텍스트파일.createNewFile();
				System.out.println(텍스트파일.getName() + "파일이 생성되었습니다.");
				
				
				
			} catch (IOException e) {
				System.out.println("파일만들기 실패했습니다.");
				e.printStackTrace();
			}
		}
	}

	public void 메서드2() {
		String 폴더경로 = "c:/Users/user1/Desktop/뉴폴더";
		
		
		//바탕화면 경로를 설정하는 방법           c:/Users/user1
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop"; 
		
		System.out.println(바탕화면경로);
		
		
		
		File 폴더만들기 =  new File(폴더경로);
		System.out.println("존재합니까? : " + 폴더만들기.exists());
		if(폴더만들기.exists()) {
			System.out.println("폴더가 이미 존재합니다.");
		} else {
			폴더만들기.mkdir();
			System.out.println("폴더 새로 만들기 성공!");
		}
		File 텍스트파일 =  new File(폴더만들기 + "/파일생성.txt");
		
		if(텍스트파일.exists()) {
			System.out.println("파일이 존재합니다.");
		} else { //존재하지 않는다면
			try {
				텍스트파일.createNewFile();
				System.out.println(텍스트파일.getName() + "파일이 생성되었습니다.");
			} catch (IOException e) {
				System.out.println("파일만들기 실패했습니다.");
				e.printStackTrace();
			}
		}
		
	}

	
	
	
	// main 메서드 하나 만들기
	public static void main(String[] args) {
		FilePre 파일 = new FilePre();
		//파일.메서드1();
		파일.메서드2();
	}
}







