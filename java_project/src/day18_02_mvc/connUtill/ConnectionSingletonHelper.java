package day18_02_mvc.connUtill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 ConnectionHelper 클래스의 문제
 매번 드라이버 로드,
 connection 생성
 
 어짜피 하나의 프로세스에서 하나만 만들어서 재사용 하면 될텐데...
 
 해결 방법으로 공유자원(싱글톤)이 있음  
 */

public class ConnectionSingletonHelper {
	//하나의 프로세스에서 공통적으로 사용할 수 있는 공용 자원(static)를 만들겠다.
	
	private static Connection conn;
	private ConnectionSingletonHelper() {}
	
	public static Connection getConnection(String dsn) {
		Connection conn = null;

		try {
			if(dsn.equalsIgnoreCase("mysql")) {
				Class.forName("com.mysql.jdbc.Driver"); //exception
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/encore", "root", "mysql");
			}else if(dsn.equalsIgnoreCase("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver"); //exception
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "root", "oracle");
			}else if(dsn.equalsIgnoreCase("mariadb")) {
				Class.forName("org.mariadb.jdbc.Driver"); //exception
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "mariadb");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		
		try {
			if( dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
			 	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SampleDB",userid, pwd);
			 	
			} else if( dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
			 	conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe",userid, pwd);
			} else if(dsn.equalsIgnoreCase("mariadb")){
				Class.forName("org.mariadb.jdbc.Driver"); 
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", userid, pwd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static void close() throws SQLException{
		if(conn != null) {
			if(!conn.isClosed()) {
				
			}
		}
	}
}
