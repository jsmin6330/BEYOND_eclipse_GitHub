package day14_05_IO.Quiz;

import java.util.Scanner;

public class Member {
	protected String name;
	protected String genger;
	protected int age;
	protected int height;
	protected int weight;
	protected String BMI;
	
	public String getName() {
		return name;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		name = sc.next();
		
		System.out.print("성별(M/F): ");
		
		
		System.out.print("나이: ");
		age = sc.nextInt();
		System.out.print("키: ");
		height = sc.nextInt();
		System.out.print("몸무게: ");
		weight = sc.nextInt();
		
		this.BMI_Official();
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", BMI=" + BMI
				+ "]";
	}

	public void BMI_Official() {
		double B = this.weight / (this.height)*(this.height);
		
		if(B>=30) {
			this.BMI = "고도비만";
		}
		else if(B>=25) {
			this.BMI = "비만";
		}
		else if(B>23) {
			this.BMI = "과체중";
		}
		else if(B>18.5) {
			this.BMI = "정상체중";
		}
		else {
			this.BMI = "저체중";
		}		
	}
	
}
