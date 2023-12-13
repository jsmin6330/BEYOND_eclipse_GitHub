package day18_01_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftUpdate2 {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		
		//1. Driver load......exception
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("Driver load success!!");
				
		//2. Connection & Open
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "maria");
		System.out.println("connection success!!");		
		
		//3. 사용(DML 명령어) -- Update
		System.out.println("Gift Table data Update : 상품명/최저가/최고가 = ");
		String sql = "UPDATE GIFT_SET SET GNAME = ?, G_START = ?, G_END = ? , price = ? WHERE GNO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sc.next());
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
		pstmt.setInt(5, sc.nextInt());
		int result = pstmt.executeUpdate();
		
		conn.commit();
		System.out.println(result + " 개 데이터 수정 성공함.");
		
		//4. 닫기(자원 반환)
		pstmt.close(); 
		conn.close();		
	}
}
