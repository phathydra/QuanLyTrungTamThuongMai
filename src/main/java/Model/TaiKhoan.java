package Model;

public class TaiKhoan {
	private int id;
	private String tenTaiKhoan;
	private String matKhau;
	private String phanQuyen;
	
	public TaiKhoan(int id, String tenTaiKhoan, String matKhau, String phanQuyen) {
		super();
		this.id = id;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.phanQuyen = phanQuyen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getPhanQuyen() {
		return phanQuyen;
	}

	public void setPhanQuyen(String phanQuyen) {
		this.phanQuyen = phanQuyen;
	}	
}
