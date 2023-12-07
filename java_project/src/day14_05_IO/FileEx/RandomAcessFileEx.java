package day14_05_IO.FileEx;

import java.io.RandomAccessFile;

public class RandomAcessFileEx {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
		// RandomAccessFile 쓰기 읽기 양방향 가능, 위치 지정은 seek 메소드가 한다.
		
//		for(int i = 0; i<10; i++) {
//			raf.seek(i*100);
//			raf.writeInt(i);
//		}
//		
//		for(int i = 0; i<10; i++) {
//			raf.seek(i*100);
//			System.out.println(raf.readInt());
//		}
		
		for(int i = 0; i<=10; i++) {
			raf.seek(i*200);
			String str = "hello";
			raf.writeUTF(str + i);
		}
		
		for(int i = 0; i<=10; i++) {
			raf.seek(i*200);
			System.out.println(raf.readUTF());
		}
		
		
		System.out.println("string print success!!");
		raf.close();
	}
}
