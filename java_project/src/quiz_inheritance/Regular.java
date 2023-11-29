package quiz_inheritance;
import java.util.Scanner;

public class Regular extends Employee{
	protected int salary;

	public int getSalary() {
		return salary;
	}

	public Regular() {
		super();
		System.out.println("Regular default constructor call");
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("월급: ");
		this.salary = sc.nextInt();
	}
	
	public void display() {
		super.display();
		System.out.printf("급여: %d\n", salary);
	}
}
