/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quanlytrungtamthuongmai;

import DAO.TestConnection;

/**
 *
 * @author MY PC
 */
public class QuanLyTrungTamThuongMai {

    public static void main(String[] args) {
        TestConnection tc = new TestConnection();
        if(tc.testConnection()){
            System.out.print("Connected!");
        }
        else{
            System.out.print("Error!");
        }
    }
}
