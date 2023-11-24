package day05_03_random;
import java.util.Random;

public class Quiz_rotto {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] rotto = new int[7];
		int n;
		boolean Overlapping = false;
		
		for(int i = 0; i < 7; i++) {
			do {
				Overlapping = false;
				n = rand.nextInt(45)+1;
				for(int j = 0; j < i; j++) {
					if(rotto[j] == n) {
						Overlapping=true;
					}
				}
			}while(Overlapping!=false);	
			
			rotto[i] = n;
		}
		for(int i = 0; i < 7; i++) {
			System.out.printf("%d ", rotto[i]);
		}
	}
}
