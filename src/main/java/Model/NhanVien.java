package Model;

public class NhanVien {
	private int id;
	private int idTaiKhoan;
	private String hoTen;
	private String diaChi;
	private String chucVu;
	private int idPhongBan;
	private int trangThai;
	
	

	public NhanVien(int id, int idTaiKhoan, String hoTen, String diaChi, String chucVu, int idPhongBan, int trangThai) {
		super();
		this.id = id;
		this.idTaiKhoan = idTaiKhoan;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
		this.idPhongBan = idPhongBan;
		this.trangThai = trangThai;
	}

	public NhanVien(int id, int idTaiKhoan, String hoTen, String diaChi, String chucVu, int idPhongBan) {
		super();
		this.id = id;
		this.idTaiKhoan = idTaiKhoan;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
		this.idPhongBan = idPhongBan;
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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public int getIdPhongBan() {
		return idPhongBan;
	}

	public void setIdPhongBan(int idPhongBan) {
		this.idPhongBan = idPhongBan;
	}
	
	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	
}
