//package day05_03_random;
//
//public class MainEntry { // Math.random() 사용법
//	public static void main(String[] args) { 
//		System.out.println(Math.random()); //0.0~1.0
//		System.out.println(Math.random()*5); //0.0~4.0
//		System.out.println((int)(Math.random()*5)); //0~4
//		System.out.println((int)(Math.random()*45)+1); //0~45
//	}
//}


package day05_03_random;
import java.util.Random;

public class MainEntry { //Random class 사용법
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextInt(5));
	}
}
