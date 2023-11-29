package quiz_inheritance;

import java.util.Scanner;

public class PartTime extends Employee{
	protected int work_day;
	protected int wage_1day;
	protected int wage_1month;
	
	public int getWork_day() {
		return work_day;
	}

	public int getWage_1day() {
		return wage_1day;
	}

	public void setWage_1month() {
		wage_1month = this.wage_1day * this.work_day;
	}
	
	public int getWage_1month() {
		return wage_1month;
	}

	public PartTime() {
		super();
		System.out.println("PartTime default constructor call");
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("근무일자? : ");
		this.work_day = sc.nextInt();
		System.out.print("일급은?? : ");
		this.wage_1day = sc.nextInt();
		this.setWage_1month();
	}
	
	public void display() {
		super.display();
		System.out.printf("급여: %d\n", wage_1month);
	}
}
