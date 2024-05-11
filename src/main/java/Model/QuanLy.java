package Model;

import java.util.Date;

public class QuanLy {
	private int id;
	private int idTaiKhoan;
	private String hoTen;
	private Date ngaySinh;
	
	public QuanLy(int id, int idTaiKhoan, String hoTen, Date ngaySinh) {
		super();
		this.id = id;
		this.idTaiKhoan = idTaiKhoan;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(int idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
}
