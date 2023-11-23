//package day04_quiz;
//
//public class Quiz_1123 { // 1번
//	public static void main(String[] args) {
//		int result = 0;
//		
//		for(int i = 1; i<6 ; i ++) {
//			int sum_j = 0;
//			System.out.print("(");
//			for(int j = 1; j < i + 1; j ++) {
//				sum_j += j;
//				System.out.printf("%d", j);
//				if(j != i) {
//					System.out.print("+");
//				}
//			}
//			System.out.print(")");
//			result += sum_j;
//			
//			if(i != 5) {
//				System.out.print("+");
//			}
//		}
//		System.out.printf(" = %d", result);
//	}
//}


//package day04_quiz;
//
//public class Quiz_1123 { // 2번
//	public static void main(String[] args) {
//		int result = 0;
//		for(int i = 1; i< 11; i++) {
//			if(i % 2 == 1) {
//				result = result - i;
//				System.out.printf("(-%d)", i);
//			}
//			else {
//				result = result + i;
//				System.out.printf("%d", i);
//			}
//			if(i != 10) {
//				System.out.print("+");
//			}
//		}
//		System.out.printf(" = %d", result);
//	}
//}


//package day04_quiz;
//
//public class Quiz_1123 { // 3번
//	public static void main(String[] args) {
//		double result = 0;
//		int a = 0;
//		int b = 0;
//				
//		for(int i = 1; i< 10; i++) {
//			a = i;
//			b = i+1;
//			System.out.printf("%d/%d ",a , b);
//			result = result + ((double)a/(double)b);
//			if(i!=9) {
//				System.out.print("+ ");
//			}
//		}
//		System.out.printf("= %.2f", result);
//	}
//}


package day04_quiz;
import java.util.Scanner;

public class Quiz_1123 { // 4번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 3개를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int temp = 0;
		int i = 0;
		while(i < 3) {
			if(a < b) {
				temp = a;
				a = b;
				b = temp;
			}	
			if(b < c) {
				temp = b;
				b = c;
				c = temp;
			}
			i++;
		}
		System.out.printf("%d %d %d", a, b, c);
	}
}
