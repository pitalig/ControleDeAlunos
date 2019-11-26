package com.mycompany.controledealunos.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

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
        database = "progweb";
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
