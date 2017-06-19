package com.ristorante.interfacesDAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbutils.DbUtils;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.ristorante.interfacesDAO.UserDAO;
import com.ristorante.login.DBconnection;
import com.ristorante.model.UserModel;

public class UserDAOimpl implements UserDAO {
	
	final static String GETALL_USER = "Select * FROM Users;";
	final static String SEARCH_USER = "SELECT * From Users where username=?;";
	
	public ArrayList<UserModel> getAllUser(){
		UserModel userModel=new UserModel();
		ArrayList<UserModel> userModelItems=new ArrayList<UserModel>();
		
		/*MysqlDataSource dataSource = new MysqlDataSource(); //TODO spring bean
		dataSource.setUser("root");
		dataSource.setPassword("root");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ristorazione");*/
		
		Connection conn = null;
		
		try {
			
			conn=DBconnection.conn();
			
			PreparedStatement stmtBrandInfo = conn.prepareStatement(GETALL_USER);			
			
			ResultSet rsBrandInfoSet = stmtBrandInfo.executeQuery();
						
			while(rsBrandInfoSet.next()){
				
				userModel.setUsername(rsBrandInfoSet.getString("username"));
				userModel.setPassword(rsBrandInfoSet.getString("password"));
				userModel.setPrivilegi(rsBrandInfoSet.getString("privilegi"));
				userModelItems.add(userModel);
				
			}
			
		}
		
		catch(SQLException e) {
			System.out.println(e.getMessage());			
		}
		finally{
		    DbUtils.closeQuietly(conn); //oppure try with resource
		}
			
	return userModelItems;
		
		
		
	}
	public UserModel getUser(String username) {
		
		UserModel user= new UserModel();
		//BrandModel brandModel= new BrandModel();
		
		MysqlDataSource dataSource = new MysqlDataSource(); //TODO spring bean
		
			dataSource.setUser("root");
			dataSource.setPassword("root");
			dataSource.setUrl("jdbc:mysql://localhost:3306/Ristorazione");
			
			Connection conn = null;
			
			try {
				
				conn = dataSource.getConnection();
			
				PreparedStatement stmtUserInfo = conn.prepareStatement(SEARCH_USER);
				stmtUserInfo.setString(1, username);
				
				ResultSet rsUserInfoSet = stmtUserInfo.executeQuery();
							
				if(rsUserInfoSet.first()){
					
					user.setUsername(rsUserInfoSet.getString("username"));
					user.setPassword(rsUserInfoSet.getString("password"));
					user.setPrivilegi(rsUserInfoSet.getString("privilegi"));
					
				}
				
			}
			
			catch(SQLException e) {
				System.out.println(e);			
			}
			finally{
			    DbUtils.closeQuietly(conn); //oppure try with resource
			}
				
		
		return user;
	}

	public void updateUser(String password, String privilegi) {
		// TODO Auto-generated method stub
		
	}

	public void insertUser(String username, String password, String privilegi) {
		// TODO Auto-generated method stub
		
	}

	public boolean deleteUser(String username, String password, String privilegi) {
		// TODO Auto-generated method stub
		return false;
	}

}
