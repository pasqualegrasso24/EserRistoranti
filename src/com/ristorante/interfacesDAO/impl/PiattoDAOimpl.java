package com.ristorante.interfacesDAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbutils.DbUtils;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.ristorante.interfacesDAO.PiattoDAO;
import com.ristorante.login.DBconnection;
import com.ristorante.model.PiattoModel;

public class PiattoDAOimpl implements PiattoDAO{
	final static String GETALL_PIATTI = "Select * FROM Piatto where idMenu=? order by portata;";
	
	public PiattoDAOimpl(){}
	@Override
	public ArrayList<PiattoModel> getAllPiatto(int id) {
		PiattoModel piattoModel=null;		
		ArrayList<PiattoModel> piattoModelItems=new ArrayList<PiattoModel>();
		
		
		Connection conn = null;
		
		try {
			
			conn=DBconnection.conn();
		
			PreparedStatement stmtPiattoInfo = conn.prepareStatement(GETALL_PIATTI);			
			stmtPiattoInfo.setInt(1, id);
			ResultSet rsPiattoInfoSet = stmtPiattoInfo.executeQuery();
						
			while(rsPiattoInfoSet.next()){
				piattoModel=new PiattoModel();
				
				piattoModel.setIdPiatto(rsPiattoInfoSet.getInt("idPiatto"));
				piattoModel.setDescrizione(rsPiattoInfoSet.getString("descrizione"));
				piattoModel.setTipo(rsPiattoInfoSet.getString("tipo"));
				piattoModel.setPortata(rsPiattoInfoSet.getString("portata"));				
				piattoModelItems.add(piattoModel);
				
			}
			
			
		}
		
		catch(SQLException e) {
			System.out.println(e.getMessage());			
		}
		finally{
		    DbUtils.closeQuietly(conn); //oppure try with resource
		}

		return piattoModelItems;
	}

	@Override
	public PiattoModel getPiatto(int idPiatto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePiatto(String descrizione, String tipo, String portata, int idMenu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertPiatto(String descrizione, String tipo, String portata, int idMenu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deletePiatto(int idPiatto) {
		// TODO Auto-generated method stub
		return false;
	}

}
