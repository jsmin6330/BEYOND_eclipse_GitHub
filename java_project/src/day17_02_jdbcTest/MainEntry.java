package day17_02_jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		
		//1. Driver load......exception
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("Driver load success!!");
		
		//2. Connection & Open
		//                  driver://IP:portNumber/DBName
		String url = "jdbc:mariadb://localhost:3306/encore";
		String uid = "root";
		String pwd = "maria"; 
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!!");
		
		//3. 사용(DML 명령어)
		
		
		//4. 닫기(자원 반환)
		
		
	}
}
