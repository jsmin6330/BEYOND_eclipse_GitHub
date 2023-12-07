package day14_01_IO.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Fileinformation {
	public static void main(String[] args) throws IOException {
		
		File file = null;
		
		byte[] fileName = new byte[100];
		System.out.print("file name = ");
		
		System.in.read(fileName);
		String strName = new String(fileName).trim();
		
		file = new File(strName);
		System.out.println("절대경로: "+ file.getAbsolutePath());
		System.out.println("표준경로: " + file.getCanonicalPath());
		System.out.println("최종수정일: "+ new Date(file.lastModified()));
		System.out.println("파일크기: "+ file.length());
		System.out.println("읽기속성: "+ file.canRead());
		System.out.println("쓰기속성: "+ file.canWrite());
		System.out.println("파일경로: "+ file.getPath());
		System.out.println("숨김속성: "+ file.isHidden());
	}
}
