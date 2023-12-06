package day13_quiz.IO.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	protected int su1;
	protected char ch;
	protected int su2;
	
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int su1 = Integer.parseInt(br.readLine());
		char ch = br.readLine().charAt(0);
		int su2 = Integer.parseInt(br.readLine());
		
		this.su1 = su1;
		this.ch = ch;
		this.su2 = su2;
	}
	
	public int getSu2() {
		return su2;
	}

	public char getCh() {
		return ch;
	}

	public int plus() {
		return (su1 + su2);
	}
	
	public int minus() {
		return (su1 - su2);
	}
	
	public int multiply() {
		return (su1 * su2);
	}
	
	public double sub() {
		return (su1 / su2);
	}
	
}
