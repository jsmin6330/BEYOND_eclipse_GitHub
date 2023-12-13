package day18_01_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		
		//1. Driver load......exception
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("Driver load success!!");
				
		//2. Connection & Open
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "maria");
		System.out.println("connection success!!");
		
		//3. 사용(DML 명령어) -- insert
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO gift_set VALUES(12, '식용유', 900, 1300, 0)";
		int result = stmt.executeUpdate(sql);
		conn.commit();
		System.out.println(result + "개 데이터 추가 성공함");
		
		
		//4. 닫기(자원 반환)
		stmt.close();
		conn.close();	
	}
}
