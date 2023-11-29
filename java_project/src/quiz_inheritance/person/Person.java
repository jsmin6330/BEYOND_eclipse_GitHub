package quiz_inheritance.person;

import java.util.Scanner;

public class Person {
	protected String name;
	protected String gender;
	protected int age;
	
	public Person() {
		this.input();
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름? : ");
		name = sc.next();
		System.out.print("성별? : ");
		gender = sc.next();
		System.out.print("나이? : ");
		age = sc.nextInt();
	}
	
	public void output() {
		System.out.printf("이름: %s, 성별: %s, 나이: %d살\n", name, gender, age);
	}
}
