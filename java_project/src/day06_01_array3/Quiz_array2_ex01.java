package day06_01_array3;

public class Quiz_array2_ex01 {
	public static void main(String[] args) {
		//  주어져있는 2차원 배열을 보고, 배열 점수의 총점/평균 구하시오.
		int[][] score = { { 98, 98, 90, 92, 99 },
				{ 81, 82, 83, 84, 85 },
				{ 71, 73, 75, 77, 79 },
				{ 60, 65, 60, 65, 69 },
				{ 77, 74, 79, 78, 72} };
		
		
		int total_all = 0;
		double avg_all = 0;
		
		int[] total = new int[score.length];
		double[] avg = new double[score.length];
	
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j < score[0].length; j++) {
				total[i] += score[i][j];
			}
			avg[i] = (double)total[i]/(double)(score[0].length);
			total_all += total[i];
			System.out.printf("총점: %d, 평균: %.2f\n", total[i], avg[i]);
		}
		avg_all = (double)total_all/(double)(score.length);
		System.out.println();	
		System.out.println("-----------------------------");
		System.out.printf("학급 총점: %d, 학급 총 평균: %.2f\n", total_all, avg_all);
		System.out.println("\n시스템이 종료했습니다.");
		}
}
