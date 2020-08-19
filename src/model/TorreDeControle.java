package model;

import java.util.ArrayList;

import interfaces.Voador;

public class TorreDeControle {
	 private ArrayList<Voador> voadores = new ArrayList<Voador>();
	 
	 
	 public ArrayList getVoadores() {
		return voadores;
	}


	public void addVoador(Voador voador) {
		voadores.add(voador);
	}


	public void voemTodos() {
		 for(Voador voador:voadores) {
			 voador.voar();
		 }
	 }

}
