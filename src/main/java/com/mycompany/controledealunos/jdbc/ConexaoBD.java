package com.mycompany.controledealunos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	public Connection getConnection() {
		System.out.println("Conectando ao banco de dados");
		try {
			// para o MySQL
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/progweb";
			return DriverManager.getConnection(url, "root", "root");
			// para o H2
			// Class.forName("org.h2.Driver");
			// String url = "jdbc:h2:tcp://localhost/~/progweb";
			// return DriverManager.getConnection(url, "admin", "admin");
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
