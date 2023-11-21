package day02_01_operater.quiz;

public class Quiz02 {
	public static void main(String[] args) {
		int time = 12345;
		System.out.println( time/3600  + "시");
		System.out.println( (time%3600)/60  + "분");
		System.out.println( (time%3600)%60  + "초");
	}
}
