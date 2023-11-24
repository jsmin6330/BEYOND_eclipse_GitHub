package day05_02_array2;
import java.util.Scanner;

public class Quiz_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] num_list2 = new int[2][3];
		
		int sum = 0;
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				num_list2[i][j] = sc.nextInt();
				sum += num_list2[i][j];
			}//in for end
		}//out for end
		
		System.out.printf("합은 %d입니다.",sum);
	}
}
