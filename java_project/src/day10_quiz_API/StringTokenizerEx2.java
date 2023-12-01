package day10_quiz_API;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("사과=5|초코렛=3|샴페인=1", "=|", true);
		
//		while(token.hasMoreTokens()) {
//			System.out.println(token.nextToken());
//		}
		
		while(token.hasMoreTokens()) {
			String str = token.nextToken();
			if(str.equals("=")) System.out.println("\t");
			else if(str.equals("|"))  System.out.println("\n");
			else System.err.println(str);
		}
	}
}
