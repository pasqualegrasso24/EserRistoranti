package com.ristorante.interfacesDAO;

import java.util.ArrayList;

import com.ristorante.model.PiattoModel;



public interface PiattoDAO {
	public ArrayList<PiattoModel> getAllPiatto(int id);
	public PiattoModel getPiatto(int idPiatto);
	public void updatePiatto(String descrizione,String tipo,String portata,int idMenu);
	public void insertPiatto(String descrizione,String tipo,String portata,int idMenu);
	public boolean deletePiatto(int  idPiatto);
}
