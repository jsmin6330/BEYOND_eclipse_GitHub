package day17_03_jdbc_giftSelect;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GiftSelect {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		//1. Driver load......exception
		Class.forName("org.mariadb.jdbc.Driver");
		
		//2. Connection & Open
		//                  driver://IP:portNumber/DBName
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "maria");
		
		//3. 사용(DML 명령어)
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM gift_set "); //반환값 있는 경우
		
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		
		while(rs.next()) {
			int gno = rs.getInt(1); //db의 필드 순서는 1번부터 시작한다.
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		
		//4. 닫기(자원 반환)
		rs.close();
		stmt.close();
		conn.close();
	}
}
// SQL Query구문, HTML Tag는 자바에서 문자열 취급한다.