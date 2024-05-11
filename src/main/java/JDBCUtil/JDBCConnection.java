package JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlytttm", "root", "123456789");
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return con;
	}
	public static void main(String[] args) throws SQLException {
		Connection conn = JDBCConnection.getConnection();
		if(conn != null) {
			System.out.println("Connect to MySQL successfully!");
			conn.close();
		}else
			System.out.println("Can not connect to MySQL!");
	}
	
}