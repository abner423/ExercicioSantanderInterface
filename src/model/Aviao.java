package model;

import interfaces.Voador;

public class Aviao implements Voador {
	private Integer horasDeVoo;
	
	public Aviao() {
		horasDeVoo = 0;
	}

	@Override
	public void voar() {
		horasDeVoo += 13;
		System.out.println("Estou voando como um aviao, "
				+ "e tenho " + horasDeVoo + " horas de voo");
	}

	public Integer getHorasDeVoo() {
		return horasDeVoo;
	}

	public void setHorasDeVoo(Integer horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}
	
}
