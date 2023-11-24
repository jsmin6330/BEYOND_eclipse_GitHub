//package day05_01_array;
//
//public class ArrayEx1 {
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		int sum = 0;
//		for(int i = 0; i< arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
//	}
//}


package day05_01_array1;
import java.util.Scanner;

public class Quiz_array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.print("데이터를 입력하세요(공백 구분): ");
		for(int i = 0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i< arr.length; i++) {
			System.out.printf("arr[%d] = %d\n",i, arr[i] );
		}
	}
}
