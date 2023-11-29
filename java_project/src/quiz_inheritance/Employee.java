package quiz_inheritance;

import java.util.Scanner;

public class Employee { //Super class
	protected int empNo;
	protected String name;
	protected String department;
	protected String phone_num;
	
	public int getEm_num() {
		return empNo;
	}
	public void setEm_num(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	
	public Employee() {
		this.input();
		System.out.println("Employee default constructor call");
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번: ");
		this.empNo = sc.nextInt();
		System.out.print("이름: ");
		this.name = sc.next();
		System.out.print("부서: ");
		this.department = sc.next();
		System.out.print("전화번호: ");
		this.phone_num = sc.next();
	}

	public void display() {
		System.out.printf("-------사원정보---------\n");
		System.out.printf("사번: %s, 이름: %s, 부서: %s, 연락처: %s \n",empNo, name, department, phone_num);
	}
}
