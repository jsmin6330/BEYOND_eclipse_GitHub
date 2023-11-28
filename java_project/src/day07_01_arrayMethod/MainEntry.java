package day07_01_arrayMethod;

public class MainEntry {
	public static void main(String[] args) {
		int x = 3, y = 5;
		int result = methodEx(x, y);
		System.out.println(result);
		
		int[] arr_result = methodEx2();
		for(int i = 0; i<arr_result.length; i++) {
			System.out.printf("%d ", arr_result[i]);
		}
		System.out.println();
		
		for( int item: arr_result) {
			System.out.printf("%d ", item);
		}
		System.out.println();
		
		// --------------------------------------------------2차원 배열 함수 만들기 출력
		int[][] resultArr2 = methodEx3();
		for(int i = 0; i<resultArr2.length; i++) {
			for(int j = 0; j<resultArr2[i].length; j++) {
				System.out.printf("%d ", resultArr2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int[] item: resultArr2) {
			for(int arritem: item) {
				System.out.printf("%d ", arritem);
			}
			System.out.println();
		}
		// -------------------------------------------------------
		int index = 0;
		for(int[] item : resultArr2) {
			System.out.printf("index: %d ", index++);
			System.out.print(item+"\t");
			System.out.print(item.hashCode()+"\t");
			//hashCode() : 가지고 있는 주소를 10진 값으로 출력
		}
		
		
		
	}// end main

	private static int[][] methodEx3() {
		int[][] arr = {{1,2,3,4},{5,6,7,8}};
		return arr;
	}

	public static int[] methodEx2() {
		int[] arr = {1, 2, 3, 4, 5};
		return arr;
	}

	public static int methodEx(int x, int y) {
		return x+y;
	}
	

}