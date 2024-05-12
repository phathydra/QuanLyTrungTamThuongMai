package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.YeuCauDAO;
import JDBCUtil.JDBCConnection;

public class YeuCauController {
	Connection conn = JDBCConnection.getConnection();
	YeuCauDAO yeuCauDAO = new YeuCauDAO();
	public void guiYeuCauThue(int maThuongNhan, String ngayBatDauThue, int idMatBang) {
		Statement stm;
		try {
			stm = conn.createStatement();
	        ResultSet hd = stm.executeQuery("SELECT * FROM quanlytttm.hopdong WHERE idThuongNhan="+ maThuongNhan + 
	        	     " and idMatBang=" + idMatBang + " and ngayBatDauThue= '" + ngayBatDauThue + "'");
//	        System.out.println("Mã thương nhân: " + maThuongNhan);
//	        System.out.println("Mã mặt bằng: " + idMatBang);
//	        System.out.println("Ngày bất đầu thuê: " + ngayBatDauThue);
	        String thoiHanThue = null;
	        if (hd.next()) {
	        	thoiHanThue = hd.getString("thoiHanThue");
//		        System.out.println("Thời hạn thuê: " + thoiHanThue);
	        }
	        String hoTen = null;
	        String ngaySinh = null;
	        String gioiTinh = null;
	        ResultSet tn = stm.executeQuery("SELECT * FROM thuongnhan WHERE id= "+ maThuongNhan);
	        if(tn.next()) {
	        	hoTen = tn.getString("hoTen");
		        ngaySinh = tn.getString("ngaySinh");
		        String gt = tn.getString("gioiTinh");
		        
		        gioiTinh = null;
		        if (gt.equals("1")) {
		            gioiTinh = "Nam";
		        }else {
		        	gioiTinh = "Nữ";
		        }
//		        System.out.print("Họ tên: " + hoTen);
//		        System.out.print("Ngày sinh: " + ngaySinh);
//		        System.out.print("Giới tính: " + gioiTinh);
	        }
	        
	        ResultSet mb = stm.executeQuery("SELECT * FROM matbang WHERE id= "+ idMatBang);
	        String diaChi = null;
	        String giaThue = null;
	        if(mb.next()) {
	        	diaChi = mb.getString("diaChi");
		        giaThue = mb.getString("giaThue");
//		        System.out.print("Địa chỉ: " + diaChi);
//		        System.out.print("Giá thuê: " + giaThue);
	        }
	        
	        
	        String noiDung = "Tôi là: " + hoTen + ", " + gioiTinh + ", sinh ngày: " + ngaySinh + ". " + "\nTôi muốn thuê mặt bằng tại vị trí: " + 
	        		diaChi + " và tôi đồng ý với mức giá: " + giaThue + ".\nTôi muốn bất đầu thuê vào ngày: " + ngayBatDauThue +
	        		", với thời hạn thuê là: " + thoiHanThue + " tháng.";
	        yeuCauDAO.guiYeuCauThue( maThuongNhan, noiDung);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
