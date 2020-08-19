package model;

import interfaces.Voador;

public class Pato implements Voador {
	private Integer energia;

	public Pato() {
		energia = 100;
	}

	@Override
	public void voar() {
		if (energia >= 5) {
			energia = energia - 5;
			System.out.println("Estou voando como um pato");
		}else {
			System.out.println("Nao tenho energia suficiente para voar");
		}
	}

	public Integer getEnergia() {
		return energia;
	}

	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	

}
