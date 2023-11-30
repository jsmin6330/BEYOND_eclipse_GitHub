package day09_quiz_abstract;

import java.util.Scanner;

public class Subway extends Travel {
	String vehicle = "지하철";
	
	@Override
	public void start() {
		input();
		System.out.printf("%s역에서 출발합니다.\n", start_pont);
	}
	
	@Override
	public void stop() {	
		System.out.printf("이번 정류장은 %s역입니다.\n", end_pont);
	}
	
	@Override
	public void show() {	
		start();
		stop();
		System.out.printf("%s를 타고 %s에서 출발해서 %s에 도착했습니다.\n", vehicle, start_pont, end_pont);
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("출발지를 입력하세요: ");
		this.start_pont  = sc.next();
		
		System.out.printf("도착지를 입력하세요: ");
		this.end_pont  = sc.next();
	}
}
