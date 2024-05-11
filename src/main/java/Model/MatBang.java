package Model;

public class MatBang {
	private int id;
	private String diaChi;
	private String dienTich;
	private String loaiHinhKinhDoanh;
	private double giaThue;
	public MatBang(int id, String diaChi, String dienTich, String loaiHinhKinhDoanh, double giaThue) {
		super();
		this.id = id;
		this.diaChi = diaChi;
		this.dienTich = dienTich;
		this.loaiHinhKinhDoanh = loaiHinhKinhDoanh;
		this.giaThue = giaThue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getDienTich() {
		return dienTich;
	}
	public void setDienTich(String dienTich) {
		this.dienTich = dienTich;
	}
	public String getLoaiHinhKinhDoanh() {
		return loaiHinhKinhDoanh;
	}
	public void setLoaiHinhKinhDoanh(String loaiHinhKinhDoanh) {
		this.loaiHinhKinhDoanh = loaiHinhKinhDoanh;
	}
	public double getGiaThue() {
		return giaThue;
	}
	public void setGiaThue(double giaThue) {
		this.giaThue = giaThue;
	}
	
}
