//package day05_01_array2;
//
//public class Quiz_ex4 { 
//	public static void main(String[] args) {
//		int[][] num_list = { { 7, 2, 1, 3 }, { 4, 5, 6, 7 }, {0, 0, 0, 0} };
//		//int[][] num_list2 = new int[][] { { 7, 2, 1, 3 }, { 4, 5, 6, 7 }, {0, 0, 0, 0} };
//		
//		for(int i = 0; i<num_list.length+1; i++) {
//			num_list[2][i] = num_list[0][i] + num_list[1][i];
//			System.out.printf("%d ", num_list[2][i]);
//		}
//	}
//}

//package day05_01_array2;
//import java.util.Scanner;
//
//public class Quiz_ex4 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[][] num_list = new int[3][4];
//		
//		for(int i = 0; i<num_list.length; i++) {
//			for(int j = 0; j< num_list[i].length; j++) {
//				if(i == 2) {
//					num_list[2][j] = num_list[0][j] + num_list[1][j];
//					System.out.printf("%d ", num_list[2][j]);
//				}
//				else {
//					num_list[i][j] = sc.nextInt();
//				}
//			}
//		}
//	}
//}

package day05_02_array2;
import java.util.Scanner;

public class Quiz_ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] num_list = new int[3][4];
		
		for(int j = 0; j< num_list[0].length; j++) {
			for(int i = 0; i<num_list.length; i++) {
				if(j == 3) {
					num_list[i][3] = num_list[i][0]+ num_list[i][1] + num_list[i][2];
					System.out.printf("%d ", num_list[i][3]);
				}
				else {
					num_list[i][j] = sc.nextInt();
				}
			}
		}
	}
}
