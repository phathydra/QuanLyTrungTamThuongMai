/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Date;
/**
 *
 * @author MY PC
 */
public class HOPDONG {
    private int id;
    private int idThuongNhan;
    private Date ngayBatDauThue;
    private int thoiHanThue;
    private int idMatBang;

    public HOPDONG() {
    }

    public HOPDONG(int id, int idThuongNhan, Date ngayBatDauThue, int thoiHanThue, int idMatBang) {
        this.id = id;
        this.idThuongNhan = idThuongNhan;
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
