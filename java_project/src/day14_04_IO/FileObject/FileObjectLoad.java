package day14_04_IO.FileObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileObjectLoad {
	public static void main(String[] args) {
		String name, id, pwd, temp, phone;
		name = id = pwd = temp = phone = null;
		int age = 0;
		boolean gender = true;
		
		File f = new File("members.txt");
		FileInputStream fis = null;
		ObjectInputStream bis = null;
		
		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);
			
			name = (String)bis.readObject();
			id = (String)bis.readObject();
			pwd = (String)bis.readObject();
			gender = (Boolean)bis.readObject();
			age = (Integer)bis.readObject();
			phone = (String)bis.readObject();
			
			System.out.println("\t\t\t >> 회원정보 <<< \n");
			System.out.println("Name \t\t ID \t\t PWD \t\t Gender \t Age \t Phonenumber");
			System.out.println();
			System.out.print(name + "\t" + id+ "\t" + pwd +"\t");
			if(gender == true) System.out.println("남자");
			else System.out.print("여자");
			System.out.print(age + "\t" + phone+ "\t");
			
			
		}catch(Exception e) {
			e.printStackTrace(); 
		}finally {
			//oos.close();
		}
		
	}
}
