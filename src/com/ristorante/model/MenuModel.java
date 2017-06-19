package com.ristorante.model;

import java.util.ArrayList;

public class MenuModel {
	private String descrizione;
	private int idMenu,idRistorante;
	private double prezzo;
	ArrayList<PiattoModel> piatto;
	public MenuModel(){}
	
	
	public MenuModel(String descrizione, int idMenu, int idRistorante, double prezzo) {
		
		this.descrizione = descrizione;
		this.idMenu = idMenu;
		this.idRistorante = idRistorante;
		this.prezzo = prezzo;
		this.piatto=new ArrayList<PiattoModel>();
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}
	public int getIdRistorante() {
		return idRistorante;
	}
	public void setIdRistorante(int idRistorante) {
		this.idRistorante = idRistorante;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public ArrayList<PiattoModel> piatti(){
		return this.piatto;
	}
	public void addPiatti(PiattoModel newPiatto){
		piatto.add(newPiatto);
	}


	@Override
	public String toString() {
		return  descrizione + " " + prezzo+"\n";
	}
	

}
