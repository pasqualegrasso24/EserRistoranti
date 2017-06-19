package com.ristorante.interfacesDAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbutils.DbUtils;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.ristorante.interfacesDAO.MenuDAO;
import com.ristorante.login.DBconnection;
import com.ristorante.model.MenuModel;
;

public class MenuDAOimpl implements MenuDAO {
	
	final static String GETALL_Menu = "Select * FROM Menu where idRistorante=?;";
	
	public MenuDAOimpl(){}

	@Override
	public ArrayList<MenuModel> getAllMenu(int id) {
		MenuModel menuModel=null;		
		ArrayList<MenuModel> menuModelItems=new ArrayList<MenuModel>();
		
		
		Connection conn = null;
		
		try {
			
			conn=DBconnection.conn();
		
			PreparedStatement stmtMenuInfo = conn.prepareStatement(GETALL_Menu);			
			stmtMenuInfo.setInt(1, id);
			ResultSet rsMenuInfoSet = stmtMenuInfo.executeQuery();
						
			while(rsMenuInfoSet.next()){
				menuModel=new MenuModel();
				
				menuModel.setIdMenu(rsMenuInfoSet.getInt("idMenu"));
				menuModel.setDescrizione(rsMenuInfoSet.getString("descrizione"));
				menuModel.setPrezzo(rsMenuInfoSet.getDouble("prezzo"));
				menuModel.setIdRistorante(rsMenuInfoSet.getInt("idRistorante"));
				menuModelItems.add(menuModel);
				
			}
			
			
		}
		
		catch(SQLException e) {
			System.out.println(e.getMessage());			
		}
		finally{
		    DbUtils.closeQuietly(conn); //oppure try with resource
		}


		return menuModelItems;
	}

	@Override
	public MenuModel getMenu(int idMenu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMenu(String descrizione, double prezzo, int idRistorante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertMenu(String descrizione, double prezzo, int idRistorante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteMenu(int idMenu) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
