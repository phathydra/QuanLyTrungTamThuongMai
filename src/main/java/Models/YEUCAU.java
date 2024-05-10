/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MY PC
 */
public class YEUCAU {
    private int id;
    private String tieuDe;
    private String noiDung;
    private int idNguoiGui;
    private int idNguoiNhan;
    private int trangThai;

    public YEUCAU() {
    }

    public YEUCAU(int id, String tieuDe, String noiDung, int idNguoiGui, int idNguoiNhan, int trangThai) {
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
