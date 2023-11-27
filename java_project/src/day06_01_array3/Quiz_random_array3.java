package day06_01_array3;
import java.util.Random;

public class Quiz_random_array3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][][] arr = new int[3][3][3];

		for(int i = 0; i<arr.length; i++) {//입력
			for(int j = 0; j<arr[0].length; j++) {
				for(int k = 0; k<arr[0][0].length; k++) {
					arr[i][j][k] = rand.nextInt(100);
				}
			}
		}
		
		
		for(int i = 0; i<arr.length; i++) {//출력
			for(int j = 0; j<arr[0].length; j++) {
				for(int k = 0; k<arr[0][0].length; k++) {
					System.out.printf("%d ", arr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
