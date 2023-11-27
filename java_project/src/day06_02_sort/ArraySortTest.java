package day06_02_sort;
import java.util.Arrays;

public class ArraySortTest {
public static void main(String[] args) {
	int[] a = {7, 3, 2, 5, 8};
	
	System.out.println("****** sort 전 출력");
	for(int i = 0; i<a.length; i++) {
		System.out.printf("%d ", a[i]);
	}
	System.out.println();
	Arrays.sort(a); //정렬 알고리즘은 이미 내부적으로 
	
	System.out.println("****** sort 후 출력"); //오름차순
	for(int i = 0; i<a.length; i++) {
		System.out.printf("%d ", a[i]);
	}
	System.out.println();
	
	for(int i = a.length-1; i>=0; i--) { //내림차순
		System.out.printf("%d ", a[i]);
	}
	
	
}
}
