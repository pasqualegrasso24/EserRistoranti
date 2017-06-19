package com.ristorante.model;

public class PiattoModel {
	
	private String descrizione,tipo,portata;
	private int idPiatto,idMenu;
	public PiattoModel(){}
	
	public PiattoModel(String descrizione, String tipo, String portata, int idPiatto, int idMenu) {
		
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.portata = portata;
		this.idPiatto = idPiatto;
		this.idMenu = idMenu;
	}
	public String getPortata() {
		return portata;
	}
	public void setPortata(String portata) {
		this.portata = portata;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getIdPiatto() {
		return idPiatto;
	}
	public void setIdPiatto(int idPiatto) {
		this.idPiatto = idPiatto;
	}
	public int getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}
	@Override
	public String toString() {
		return  descrizione + " \n";
	}
	

}
