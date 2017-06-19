package com.ristorante.interfacesDAO;

import java.util.ArrayList;

import com.ristorante.model.MenuModel;

public interface MenuDAO {
	public ArrayList<MenuModel> getAllMenu(int id);
	public MenuModel getMenu(int idMenu);
	public void updateMenu(String descrizione,double prezzo,int idRistorante);
	public void insertMenu(String descrizione,double prezzo,int idRistorante);
	public boolean deleteMenu(int  idMenu);
}
