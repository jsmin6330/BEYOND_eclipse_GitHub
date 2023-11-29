package quiz_inheritance.person;

import java.util.Scanner;

public class Student extends Person{
	protected int score;
	
	public Student() {
		super();
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		score = sc.nextInt();
	}
	
	public void output() {
		super.output();
		System.out.printf("점수: %d점\n", score);
	}
}
