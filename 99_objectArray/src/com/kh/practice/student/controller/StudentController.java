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
	
	//학생들의 점수를 모두 더해서 총점을 계산
	public int sumScore() { //점수 합한 값 전달
		int sum = 0;
		for(Student s : sArr) {
			sum += s.getScore();
		}
		//마지막으로 총합을 sumScore을 부른다면 내가 가진 점수를 보여주겠다 
		return sum;
	}
	//총점을 받아서 평균 구하기
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore(); //위에서 만든 모든 학생의 총점 더한 값을 저장하는 공간 0
		avgArr[1] = avgArr[0] / sArr.length; //  평균 = 총점 / 총학생수
		return avgArr;
	}

	
	
	
	

	
}











