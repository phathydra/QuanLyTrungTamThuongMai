package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import JDBCUtil.JDBCConnection;
import Model.NhanVien;

public class NhanVienDAO {
	
	Connection conn = JDBCConnection.getConnection();
		
	public List<NhanVien> layDanhSachNhanVien(int maPhong){
		List<NhanVien> listNhanVien = new LinkedList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM nhanvien WHERE idPhongBan= "+ maPhong);
                while (rs.next()) {
                	int id = rs.getInt("id");
                	int idTaiKhoan = rs.getInt("idTaiKhoan");
                    String hoTen = rs.getString("hoTen");
                    String diaChi = rs.getString("diaChi");
                    String chucVu = rs.getString("chucVu");
                    int idPhongBan = rs.getInt("idPhongBan");
                    NhanVien nhanVien = new NhanVien(id, idTaiKhoan, hoTen, diaChi, chucVu, idPhongBan);
                    listNhanVien.add(nhanVien);
                }
		}catch(SQLException e) {
			System.out.print("Không lấy được danh sách nhân viên.");
		}
		return listNhanVien;
	};
	
	public List<NhanVien> timKiemNhanVien(String thongTin) {
		List<NhanVien> listNhanVien = new LinkedList<>();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM quanlytttm.nhanvien\r\n"
					+ "WHERE CONCAT(id, idTaiKhoan, hoTen, diaChi, chucVu, idPhongBan) LIKE '%" + thongTin + "%'");
                while (rs.next()) {
                	int id = rs.getInt("id");
                	int idTaiKhoan = rs.getInt("idTaiKhoan");
                    String hoTen = rs.getString("hoTen");
                    String diaChi = rs.getString("diaChi");
                    String chucVu = rs.getString("chucVu");
                    int idPhongBan = rs.getInt("idPhongBan");
                    NhanVien nhanVien = new NhanVien(id, idTaiKhoan, hoTen, diaChi, chucVu, idPhongBan);
                    listNhanVien.add(nhanVien);
                }
		}catch(SQLException e) {
			System.out.print("Không lấy được danh sách nhân viên.");
		}
		return listNhanVien;
	}
	
	public void xoaNhanVien(int maNhanVien) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM nhanvien WHERE id=" + maNhanVien);
		}catch(SQLException e) {
			System.out.print("Không thể xoá nhân viên.");
		}
	}
	
}
