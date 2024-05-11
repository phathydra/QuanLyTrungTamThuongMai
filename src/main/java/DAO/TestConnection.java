/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JDBCUtil.JDBCUtil;


public class TestConnection {
    
    public TestConnection(){}
    
    public boolean testConnection(){
        try(Connection cnn = new JDBCUtil().createConnection();
            PreparedStatement statement = cnn.prepareStatement("SELECT * FROM quanlytttm.taikhoan")){
            statement.execute();
        } catch(SQLException | ClassNotFoundException e){
            return false;
        }
        return true;
    }
}
