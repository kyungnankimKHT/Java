//14_Thread

package com.kh.ThreadEx;
/*
process : program + success = 프로그램 실행 성공 ! 그말은 프로그램 실행중
Thread(스레드) : 실
스레드는 컴퓨터에서 실제로 작업을 수행하는 것을 의미

두 개 이상의 스레드를 가지는 프로세스를 멀티스레드 

스레드를 생성하는 방법
1.Runnable 인터페이스 사용  클래스명 옆에 implements Runnable

2.Thread 클래스 상속받기    클래스명 옆에 extends Thread
	메서드와 관계없이 스레드를 시작할 때는 start() 사용해야지 시작할 수 있음
	스레드에서 순서는 스레드가 컴퓨터 안에서 생성되고 시작도는 지점에 따라 달라짐

 * */
public class ThreadEx extends Thread {
	
	public void run() {
		System.out.println("스레드 실행 중");
		
		try {
			
			Thread.sleep(5000); //1초 동안 정지 
			
			System.out.println("5초 끝!");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}














