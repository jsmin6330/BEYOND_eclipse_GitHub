package day03_03_control_for;

public class MainEntry {
	public static void main(String[] args) {
		for(int i = 1; i <= 5 ; i++) {
			System.out.println("Hi");
		}
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.print(i);
		}
		System.out.println("");
		
		for(int i = 1; i <= 100 ; i++) {
			System.out.print(i + "\t");
			if(i % 10 == 0) {
				System.out.println("");
			}
		}
		for(int i = 1; i <= 5 ; i++) {
			System.out.print("*");
		}
	}
}
