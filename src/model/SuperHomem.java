package model;

import interfaces.Voador;

public class SuperHomem implements Voador{
	private Integer experiencia;
	
	public SuperHomem() {
		experiencia = 0;
	}
	@Override
	public void voar() {
		experiencia += 3;
		System.out.println("Estou voando como um campeao");
	}

}
