/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controledealunos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author francisco.massetto
 */
public class DataSource {
    private String hostname;
    private int    port;
    private String database;
    private String username;
    private String password;
    private Connection connection;
    
    public DataSource(){
        
        hostname = "localhost";
        port     = 3306;
        database = "ecommerce";
        username = "root";
        password = "ufabc";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("DATASOURCE - Connected!");
        }
        catch(Exception ex){
            System.out.println("DATASOURCE - ERRO AO CONECTAR ");
            System.out.println(ex.getMessage());
        }
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
}
