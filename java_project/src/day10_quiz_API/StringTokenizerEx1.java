package day10_quiz_API;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("this is a test");
		StringTokenizer sst = new StringTokenizer("this/is/a/test", "/");
		
		while(st.hasMoreTokens()) { //다음 요수가 있느냐?
			System.out.println(st.nextToken());
		}
		
		while(sst.hasMoreTokens()) { //다음 요수가 있느냐?
			System.out.println(sst.nextToken());
		}
		
		System.out.println("-----------------------------------");
		String[] result = "this is a test".split("\\s");
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
