package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JDBCUtil.JDBCConnection;

public class YeuCauDAO {
	Connection conn = JDBCConnection.getConnection();
	public void guiYeuCauThue(int maThuongNhan, String noiDung) {
		try {
			Statement stm = conn.createStatement();
            stm.executeUpdate("INSERT INTO yeucau(tieuDe, noiDung, idNguoiGui, trangThai) VALUES ('Yêu cầu thuê mặt bằng', '" + 
            noiDung + "', " + maThuongNhan + ", 0)");
            System.out.println("\n" + noiDung);
            System.out.print("Đã lưu yêu cầu thuê thành công. Đợi quản lý xác nhận thuê.\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
