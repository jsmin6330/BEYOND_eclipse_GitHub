package quiz_special.scoreclass2;

import java.util.Scanner;

public class Score {
private String name;
	private int kor, eng, com;
	private double avg;
	private int total;
	char grade;
	
	//생성자함수 3개
	public Score() {
		this.kor = 0;
		this.eng = 0;
		this.com = 0;
	}
	
	public Score(String name) {
		this.name = name;
	}
	
	public Score(String name, int kor, int eng, int com) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}

	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public double getAvg() {
		return avg;
	}
	public void setAvg(int total) {
		this.avg = (double)total/3.0;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int kor, int eng, int com) {
		this.total = kor + eng + com;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public void setGrade(double avg) {
		char grade;
		if(avg>100 || avg<60) {
			grade = 'F';
		}
		else if(avg>=90) {
			grade = 'A';
		}
		else if(avg>=80) {
			grade = 'B';
		}
		else if(avg>=70) {
			grade = 'C';
		}
		else{
			grade = 'D';
		}
		this.grade = grade;
	}
	
	//output
	public void output() {
		System.out.printf("%s님의 성적표 *****\n", name);
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor, eng, com);
		System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s\n",total,avg,grade);
	}
}
