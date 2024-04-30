package Model;

import java.util.Date;

public class HopDong {
	private int id;
	private int idThuongNhan;
	private String hoTenNguoiThue;
	private Date ngaySinh;
	private String gioiTinh;
	private Date ngayBatDauThue;
	private int thoiHanThue;
	private int idMatBang;
	public HopDong(int id, int idThuongNhan, String hoTenNguoiThue, Date ngaySinh, String gioiTinh, Date ngayBatDauThue,
			int thoiHanThue, int idMatBang) {
		super();
		this.id = id;
		this.idThuongNhan = idThuongNhan;
		this.hoTenNguoiThue = hoTenNguoiThue;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.ngayBatDauThue = ngayBatDauThue;
		this.thoiHanThue = thoiHanThue;
		this.idMatBang = idMatBang;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdThuongNhan() {
		return idThuongNhan;
	}
	public void setIdThuongNhan(int idThuongNhan) {
		this.idThuongNhan = idThuongNhan;
	}
	public String getHoTenNguoiThue() {
		return hoTenNguoiThue;
	}
	public void setHoTenNguoiThue(String hoTenNguoiThue) {
		this.hoTenNguoiThue = hoTenNguoiThue;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Date getNgayBatDauThue() {
		return ngayBatDauThue;
	}
	public void setNgayBatDauThue(Date ngayBatDauThue) {
		this.ngayBatDauThue = ngayBatDauThue;
	}
	public int getThoiHanThue() {
		return thoiHanThue;
	}
	public void setThoiHanThue(int thoiHanThue) {
		this.thoiHanThue = thoiHanThue;
	}
	public int getIdMatBang() {
		return idMatBang;
	}
	public void setIdMatBang(int idMatBang) {
		this.idMatBang = idMatBang;
	}
	
}
