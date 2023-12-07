package day14_05_IO.FileEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileBufferedReaderEx {
	public static void main(String[] args) throws Exception {
		int i = 0;
		String file;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("읽어 올 파일 이름 입력: ");
		file = br.readLine();
		
		System.out.println(file + "문서의 내용은 .....");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		
		while((i = reader.read()) != -1) {
			System.out.print((char)i + " ");
			if(fr.equals("\n")) System.out.println();
		}
		
		fr.close();
	}
}
