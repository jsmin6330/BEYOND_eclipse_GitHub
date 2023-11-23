package day04_quiz;

public class Quiz_BreakContinue {
	public static void main(String[] args) {
		
		int cnt = 0;
		for(int i = 1; i < 101; i++) {
			
			if(i%2 != 0) {
				continue;
			}
			cnt += 1;
			System.out.print(i + " ");
			if(i % 20 == 0) {
				System.out.println();
			}
		}
	}
}
