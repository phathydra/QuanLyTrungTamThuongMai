package Model;

public class PhongBan {
	private int id;
	private String tenPhongBan;
	
	public PhongBan(int id, String tenPhongBan) {
		super();
		this.id = id;
		this.tenPhongBan = tenPhongBan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
	
	
}
