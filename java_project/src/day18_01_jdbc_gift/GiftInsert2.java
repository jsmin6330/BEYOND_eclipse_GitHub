package day18_01_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert2 {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		
		//1. Driver load......exception
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("Driver load success!!");
				
		//2. Connection & Open
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "maria");
		System.out.println("connection success!!");
		
		//3. 사용(DML 명령어) -- insert
		System.out.println("Gift Table data input : 상품번호/상품명/최저가/최고가/0 = ");
		String sql = "INSERT INTO gift_set VALUES(?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 14);
		pstmt.setString(2, "수건세트");
		pstmt.setInt(3, 7000);
		pstmt.setInt(4, 10000);
		pstmt.setInt(5, 0);
		
		int result = pstmt.executeUpdate(); 
		conn.commit();
		
		System.out.println(result + " 개 데이터 추가 성공함.");
		
		
		//4. 닫기(자원 반환)
		pstmt.close(); 
		conn.close();	
	}
}
