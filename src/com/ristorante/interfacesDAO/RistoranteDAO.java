package com.ristorante.interfacesDAO;

import java.util.ArrayList;

import com.ristorante.model.RistoranteModel;


public interface RistoranteDAO {
	public ArrayList<RistoranteModel> getAllRistorante();
	public RistoranteModel getRistorante(int idRistorante);
	public void updateRistorante(String nome,String indirizzo,String telefono);
	public void insertRistorante(String nome,String indirizzo,String telefono);
	public boolean deleteRistorante(int  idRistorante);
	
}
