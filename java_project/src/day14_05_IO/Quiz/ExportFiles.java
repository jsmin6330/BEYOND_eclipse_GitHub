package day14_05_IO.Quiz;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ExportFiles{
	

	public void WriteMemberList(ArrayList<Member> m_list) throws Exception{
		String str, file;
//		Date date = new Date();
//		str = "파일 생성 시간 \r\n" + date + "\r\n" ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일 이름 입력 요망: ");
		file = br.readLine();
		
		OutputStream os = new FileOutputStream(file);
		
		Iterator it = m_list.iterator();
		
		while (it.hasNext()) {
			os.write(it.next().toString().getBytes());  // 파일
			os.write(new String("\r\n").getBytes());
		}
		os.write(m_list.toString().getBytes());
		os.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
