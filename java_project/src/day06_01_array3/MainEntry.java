package day06_01_array3;

public class MainEntry {
	public static void main(String[] args) {
		int[][][] a = new int[2][2][3]; //[면크기][행크기][열크기]]
		int[][][] a2 = new int[][][] {{{1,2,3},{4,5,6}, {1,2,3},{4,5,6}},{{1,2,3},{4,5,6}, {1,2,3},{4,5,6}}};
		int[][][] a3 = {{{1,2,3},{4,5,6}, {1,2,3},{4,5,6}},{{1,2,3},{4,5,6}, {1,2,3},{4,5,6}}};
		
		
		System.out.printf("면길이: %d\n", a3.length);
		System.out.printf("행길이: %d\n", a3[0].length);
		System.out.printf("열길이: %d\n", a3[0][0].length);
		
		
		for(int i = 0; i< a3.length; i++) { //면
			for(int j = 0; j<a3[0].length; j++) { //행
				for(int k = 0; k<a3[0][0].length ; k++) {//열
					System.out.printf("%d ", a3[i][j][k]);
				}//k end
				System.out.println();
			}// j end
			System.out.println();
		}// i end
	}
}
