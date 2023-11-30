package day09_quiz_interface;

public class MainEntry {
	public static void main(String[] args) {
		Trans ts = new Bus();
		ts.show();
		
		ts = new Subway();
		ts.show();
	}
}
