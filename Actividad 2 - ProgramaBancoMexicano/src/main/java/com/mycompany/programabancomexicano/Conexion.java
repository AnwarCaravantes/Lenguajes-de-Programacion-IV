/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programabancomexicano;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author anwar
 */
public class Conexion {
    
    public Connection  getConnection (){
    
    Connection con = null;
    String base = "bancobd";
    String url = "jdbc:mysql://localhost:3306/" + base;
    String user = "root";
    String password = "";
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
        }
        
        catch(Exception e){
            System.err.println(e);
        }
        return con;
        
    }    
}
    

