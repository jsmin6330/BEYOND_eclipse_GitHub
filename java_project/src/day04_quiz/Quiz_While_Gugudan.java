//package day04_quiz;
//import java.util.Scanner;
//
//public class Quiz_While_Gugudan { //원하는 단 입력 받아서 구구단 출력하기
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int i;
//		
//		System.out.print("원하는 단을 입력하시오: ");
//		int num = sc.nextInt();
//		//while문으로 원하는 단 입력 받아서 구구단 출력하기
//		
//		i = 1;
//		System.out.println("\nwhile------------------------");
//		while(i<=9) {
//			System.out.printf("%d * %d = %d\n", num, i, num*i);
//			i++;
//		}
//		
//		
//		
//		//Do-while문으로 원하는 단 입력 받아서 구구단 출력하기
//		i = 1;
//		System.out.println("\ndo-while------------------------");
//		do {
//			System.out.printf("%d * %d = %d\n", num, i, num*i);
//			i++;
//		}while(i<=9);
//	}
//}


package day04_quiz;
import java.util.Scanner;

public class Quiz_While_Gugudan {
	public static void main(String[] args) { //전체 구구단 출력
		int num = 2;
		int i;
		
		do {
			i = 1;
			do {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
				i++;
			}while(i<=9);
			System.out.println();
			num++;
		}while(num<=9);
		
	}
}


