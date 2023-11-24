//package day05_01_array;
//
//public class Quiz_array2 {
//	public static void main(String[] args) {
//		int[] su = {1, 7, 4, 7, 55, 90, 100, 7, 2, 7, 23};
//		
//		int count = 0;
//		for(int item:su) {
//			if(item == 7) {
//				count += 1;
//			}
//		}
//		System.out.printf("숫자 7의 개수는 %d개입니다.", count);
//	}
//}


package day05_01_array1;
import java.util.Scanner;

// 기상청 옥상에 빗물받이 통이 있눈데, 11월 한달간의 강수량을 입력 받아서, 
// 평균을 구하는 프로그램 작성
public class Quiz_array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = 3;
		double[] array = new double[day];
		
		double sum = 0;
		double avg = 0;
		
		for(int i = 0; i<day; i++) {
			System.out.printf("11월 %d일의 강수량을 입력하세요: ", i+1);
			array[i] = sc.nextDouble();
		}
		
		for(double item: array) {
			sum += item;
		}
		avg = sum/ day;
		System.out.printf("11월 한달간 비의 평균 강수량은 %.2f입니다.", avg);
	}
}