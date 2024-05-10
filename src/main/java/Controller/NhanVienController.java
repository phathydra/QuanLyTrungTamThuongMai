package Controller;

import java.util.LinkedList;
import java.util.List;

import DAO.NhanVienDAO;
import Model.NhanVien;

public class NhanVienController {
	NhanVienDAO nhanVienDao = new NhanVienDAO();
	public void layDanhSachNhanVien(int maPhong){
		List<NhanVien> nhanviens = new LinkedList<>();
		nhanviens = nhanVienDao.layDanhSachNhanVien(maPhong);
		for (NhanVien nhanvien : nhanviens) {
		    System.out.println("ID: " + nhanvien.getId());
		    System.out.println("ID Tài khoản: " + nhanvien.getIdTaiKhoan());
		    System.out.println("Họ tên: " + nhanvien.getHoTen());
		    System.out.println("Địa chỉ: " + nhanvien.getDiaChi());
		    System.out.println("Chức vụ: " + nhanvien.getChucVu());
		    System.out.println("ID Phòng ban: " + nhanvien.getIdPhongBan());
		    System.out.println("----------------------");
		}
	};
}
