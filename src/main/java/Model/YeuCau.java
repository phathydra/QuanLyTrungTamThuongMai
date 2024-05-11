package Model;

public class YeuCau {
	private int id;
	private String tieuDe;
	private String noiDung;
	private int idNguoiGui;
	private int idNguoiNhan;
	private String trangThai;
	public YeuCau(int id, String tieuDe, String noiDung, int idNguoiGui, int idNguoiNhan, String trangThai) {
		super();
		this.id = id;
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.idNguoiGui = idNguoiGui;
		this.idNguoiNhan = idNguoiNhan;
		this.trangThai = trangThai;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public int getIdNguoiGui() {
		return idNguoiGui;
	}
	public void setIdNguoiGui(int idNguoiGui) {
		this.idNguoiGui = idNguoiGui;
	}
	public int getIdNguoiNhan() {
		return idNguoiNhan;
	}
	public void setIdNguoiNhan(int idNguoiNhan) {
		this.idNguoiNhan = idNguoiNhan;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
}
