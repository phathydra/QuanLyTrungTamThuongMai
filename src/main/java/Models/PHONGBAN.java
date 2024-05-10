/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MY PC
 */
public class PHONGBAN {
    private int id;
    private String tenPhongBan;

    public PHONGBAN() {
    }

    public PHONGBAN(int id, String tenPhongBan) {
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
