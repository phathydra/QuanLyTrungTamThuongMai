package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import JDBCUtil.JDBCConnection;
import Model.MatBang;

public class MatBangDAO {

    Connection conn = JDBCConnection.getConnection();

    public List<MatBang> layDanhSachMatBang() {
        List<MatBang> listMatBang = new LinkedList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM matbang");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String diaChi = rs.getString("diaChi");
                String dienTich = rs.getString("dienTich");
                String loaiHinhKinhDoanh = rs.getString("loaiHinhKinhDoanh");
                double giaThue = rs.getDouble("giaThue");
                MatBang matBang = new MatBang(id, diaChi, dienTich, loaiHinhKinhDoanh, giaThue);
                listMatBang.add(matBang);
            }
        } catch (SQLException e) {
            System.out.println("Không lấy được danh sách mặt bằng.");
            e.printStackTrace();
        }
        return listMatBang;
    }

    public void themMatBang(MatBang matBang) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO matbang (diaChi, dienTich, loaiHinhKinhDoanh, giaThue) VALUES (?, ?, ?, ?)");
            stmt.setString(1, matBang.getDiaChi());
            stmt.setString(2, matBang.getDienTich());
            stmt.setString(3, matBang.getLoaiHinhKinhDoanh());
            stmt.setDouble(4, matBang.getGiaThue());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Không thêm được mặt bằng.");
            e.printStackTrace();
        }
    }

    public void capNhatMatBang(MatBang matBang) {
        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE matbang SET diaChi=?, dienTich=?, loaiHinhKinhDoanh=?, giaThue=? WHERE id=?");
            stmt.setString(1, matBang.getDiaChi());
            stmt.setString(2, matBang.getDienTich());
            stmt.setString(3, matBang.getLoaiHinhKinhDoanh());
            stmt.setDouble(4, matBang.getGiaThue());
            stmt.setInt(5, matBang.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Không cập nhật được mặt bằng.");
            e.printStackTrace();
        }
    }

    public boolean kiemTraDiaChiTonTai(String diaChi) {
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) AS count FROM matbang WHERE diaChi=?");
            stmt.setString(1, diaChi);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count > 0;
            }
        } catch (SQLException e) {
            System.out.println("Lỗi kiểm tra địa chỉ tồn tại.");
            e.printStackTrace();
        }
        return false;
    }
}
