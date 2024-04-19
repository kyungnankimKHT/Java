package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	//5개가 들어갈 배열을 만들어주는데 학생으로 만들어주세요.
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;//상수
//메서드
	//생성자 : 기본
	public StudentController() {
		//0번째 학생 4번째 학생까지 값을 넣어주기
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	//반환 메서드
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() { //점수 합한 값 전달
		int sum = 0;
		for(Student s : sArr) {
			sum += s.getScore();
		}
		
		return sum;
	}
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0] / sArr.length;
		return avgArr;
	}


	
}











