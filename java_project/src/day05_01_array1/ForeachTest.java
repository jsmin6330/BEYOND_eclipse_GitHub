//package day05_01_array;
//
//public class ForeachTest {
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.printf("arr[%d] = %d\n",i, arr[i] );
//		}
//		
//		//for each문
//		for(int item: arr) { //for문과의 차이점은, 멈출 수 없음
//			System.out.print(item + "\n");
//		}
//	}
//}


package day05_01_array1;

public class ForeachTest {
	public static void main(String[] args) {
		int[] score = {1, 2, 3, 4, 5};
		
		int sum = 0;
		for(int item: score) { 
			sum += item;
		}
		System.out.print(sum + "\n");
	}
}
