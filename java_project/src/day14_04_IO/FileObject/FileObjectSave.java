package day14_04_IO.FileObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class FileObjectSave {
	public static void main(String[] args) throws IOException {
		String name, id, pwd, temp, phone;
		name = id = pwd = temp = phone = null;
		int age = 0;
		boolean gender = true;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = null;
		
		File f = new File("members.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(f,true); //true 쓰면 추가모드
			oos = new ObjectOutputStream(fos);
			
			System.out.println("----------- 회원 정보 입력하기 ------------");
			System.out.print("name>> ");
			name = br.readLine();
			System.out.print("id>> ");
			id = br.readLine();
			System.out.print("password>> ");
			pwd = br.readLine();
			System.out.print("gender(m, f)>> ");
			temp = br.readLine();
			if(temp.toLowerCase().equals("m")) gender = true;
			else gender = false;
			
			System.out.print("age>> ");
			age = Integer.parseInt(br.readLine());
			System.out.print("phone>> ");
			phone = br.readLine();
			
			oos.writeObject(name);
			oos.writeObject(id);
			oos.writeObject(pwd);
			oos.writeObject(gender);
			oos.writeObject(age);
			oos.writeObject(phone);
			
			System.out.println("members.txt save!!");
			
		}catch(Exception e) {
			e.printStackTrace(); 
		}finally {
			//oos.close();
		}
	}
}	
