package com.ristorante.login;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DBconnection {
	
	public static Connection conn(){
		MysqlDataSource dataSource = new MysqlDataSource(); //TODO spring bean
		dataSource.setUser("root");
		dataSource.setPassword("root");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ristorazione");
		
		Connection conn = null;
			
			try {
				conn = dataSource.getConnection();
				return conn;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	}
}

