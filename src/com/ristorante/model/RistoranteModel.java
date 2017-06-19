package com.ristorante.model;

import java.util.ArrayList;

public class RistoranteModel {
	private String nome,indirizzo,telefono;
	int idRistorante;
	ArrayList<MenuModel> menu;
	public RistoranteModel(){}
	
	public RistoranteModel(String nome, String indirizzo, String telefono, int idRistorante) {
		
		this.setNome(nome);
		this.setIndirizzo(indirizzo);
		this.setTelefono(telefono);
		this.idRistorante = idRistorante;
		this.menu=new ArrayList<MenuModel>();
		
	}
	
	public ArrayList<MenuModel> getMenu(){
		return this.menu;
	}
	
	public void setMenu(MenuModel newMenu){
		menu.add(newMenu);
	}
	public int getIdRistorante(){
		return this.idRistorante;
	}
	public void setIdRistorante(int idRistorante){
		this.idRistorante=idRistorante;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return nome + " " + indirizzo + " " + telefono +"\n";
	}
	
	
	
	
	

}
