package Controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import DAO.NhanVienDAO;
import Model.NhanVien;

public class NhanVienController {
	NhanVienDAO nhanVienDao = new NhanVienDAO();
	public void layDanhSachNhanVien(int maPhong){
		List<NhanVien> nhanviens = new LinkedList<>();
		nhanviens = nhanVienDao.layDanhSachNhanVien(maPhong);
		for (NhanVien nhanvien : nhanviens) {
		    System.out.println("ID: " + nhanvien.getId() + " ID Tài khoản: " + nhanvien.getIdTaiKhoan() +
		    		" Họ tên: " + nhanvien.getHoTen() + " Địa chỉ: " + nhanvien.getDiaChi() + " Chức vụ: " + 
		    		nhanvien.getChucVu() + " ID Phòng ban: " + nhanvien.getIdPhongBan());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Lựa chọn:");
    	System.out.println("1. Nhập mã nhân viên để xoá.");
    	System.out.println("2. Tìm kiếm nhân viên.");
    	System.out.print("\nHãy nhập lựa chọn của bạn:");
    	int luaChon = sc.nextInt(); sc.nextLine();
    	if (luaChon == 1) {
    		System.out.print("\nHãy nhập mã nhân viên cần xoá:");
    		int maNhanVien = sc.nextInt();
    		xoaNhanVien(maNhanVien);
    	}else if(luaChon == 2) {
    		System.out.print("\nHãy nhập thông tin nhân viên cần tìm:");
    		String thongTin = sc.nextLine();
    		List<NhanVien> nhanVien = nhanVienDao.timKiemNhanVien(thongTin);
    		for (NhanVien nhanvien : nhanVien) {
    		    System.out.println("ID: " + nhanvien.getId() + " ID Tài khoản: " + nhanvien.getIdTaiKhoan() +
    		    		" Họ tên: " + nhanvien.getHoTen() + " Địa chỉ: " + nhanvien.getDiaChi() + " Chức vụ: " + 
    		    		nhanvien.getChucVu() + " ID Phòng ban: " + nhanvien.getIdPhongBan());
    		}
    		System.out.print("\nHãy nhập mã nhân viên cần xoá:");
    		int maNhanVien = sc.nextInt();
    		xoaNhanVien(maNhanVien);
    	}
	};
	
	public void xoaNhanVien(int maNhanVien) {
		nhanVienDao.xoaNhanVien(maNhanVien);
		System.out.print("\nĐã xoá nhân viên thành công.\n");
	}
}
