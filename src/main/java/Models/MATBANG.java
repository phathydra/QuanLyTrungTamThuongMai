/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MY PC
 */
public class MATBANG {
    private int id;
    private String diaChi;
    private String dienTich;
    private String loaiHinhKinhDoanh;
    private float giaThue;

    public MATBANG() {
    }

    public MATBANG(int id, String diaChi, String dienTich, String loaiHinhKinhDoanh, float giaThue) {
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

    public float getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(float giaThue) {
        this.giaThue = giaThue;
    }
    
    
}
