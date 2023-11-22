//package day03_03_control_for;
//import java.util.Scanner;
//
//public class Quiz_for {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("원하는 단은?: ");
//		int num = sc.nextInt();
//		for(int i = 1; i<=9 ; i++) {
//			System.out.printf("%d * %d = %d\n", num, i, num*i);
//		}
//	}
//}


//package day03_03_control_for;
//import java.util.Scanner;
//
//public class Quiz_for {
//	public static void main(String[] args) {
//		int num = 3;
//		int sum_num = 0;
//		int count = 0;
//		
//		for(int i = 1; i<= 100; i++) {
//			if(i%3==0) {
//				sum_num += i;
//				count += 1;
//			}
//		}
//		System.out.printf("3의 배수의 합: %d\n", sum_num);
//		System.out.printf("3의 배수의 개수: %d\n", count);
//	}
//}


//package day03_03_control_for;
//import java.util.Scanner;
//
//public class Quiz_for {
//	public static void main(String[] args) {
//		for(int a = 1, b = 1; a <= 100; a++, b+= 2) {
//			System.out.printf("a = %d, b = %d\n", a, b);
//		}
//	}
//}

package day03_03_control_for;
import java.util.Scanner;

public class Quiz_for {
	public static void main(String[] args) {
		int sum_i = 0;
		for(int i = 1; i<= 100; i++) {
			sum_i += i;
		}
		System.out.println(sum_i);
	}
}

