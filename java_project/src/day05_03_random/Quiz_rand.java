package day05_03_random;
import java.util.Random;

public class Quiz_rand { //로또번호 추첨!!!
	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i = 0; i < 6 ; i++) {
			System.out.println(rand.nextInt(45)+1);
		}	
	}
}
