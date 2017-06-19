package com.ristorante.interfacesDAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbutils.DbUtils;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.ristorante.interfacesDAO.RistoranteDAO;
import com.ristorante.login.DBconnection;
import com.ristorante.model.RistoranteModel;


public class RistoranteDAOimpl implements RistoranteDAO {
	//final static String GETALL_RISTORANTE = "Select * FROM Ristorante";
	final static String GETALL_RISTORANTE = "Select * FROM Ristorante";
	public RistoranteDAOimpl(){}
	
	@Override
	public ArrayList<RistoranteModel> getAllRistorante() {
		RistoranteModel ristoranteModel=null;		
		ArrayList<RistoranteModel> ristoranteModelItems=new ArrayList<RistoranteModel>();
		
		
		Connection conn = null;
		
		try {
			
			conn=DBconnection.conn();
		
			PreparedStatement stmtRistoranteInfo = conn.prepareStatement(GETALL_RISTORANTE);			
			
			ResultSet rsRistoranteInfoSet = stmtRistoranteInfo.executeQuery();
						
			while(rsRistoranteInfoSet.next()){
				ristoranteModel=new RistoranteModel();
				
				ristoranteModel.setIdRistorante(rsRistoranteInfoSet.getInt("idRistorante"));
				ristoranteModel.setNome(rsRistoranteInfoSet.getString("nome"));
				ristoranteModel.setIndirizzo(rsRistoranteInfoSet.getString("indirizzo"));
				ristoranteModel.setTelefono(rsRistoranteInfoSet.getString("telefono"));				
				ristoranteModelItems.add(ristoranteModel);
				
			}
			
			
		}
		
		catch(SQLException e) {
			System.out.println(e.getMessage());			
		}
		finally{
		    DbUtils.closeQuietly(conn); //oppure try with resource
		}
		
		
		return ristoranteModelItems;
	}

	@Override
	public RistoranteModel getRistorante(int idRistorante) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRistorante(String nome, String indirizzo, String telefono) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertRistorante(String nome, String indirizzo, String telefono) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteRistorante(int idRistorante) {
		// TODO Auto-generated method stub
		return false;
	}

}
