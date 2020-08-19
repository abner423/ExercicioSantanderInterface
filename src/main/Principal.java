package main;

import model.Aviao;
import model.Pato;
import model.SuperHomem;
import model.TorreDeControle;

public class Principal {

	public static void main(String[] args) {
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		SuperHomem superHomem = new SuperHomem();
		TorreDeControle torreDeControle = new TorreDeControle();
		
		torreDeControle.addVoador(pato);
		torreDeControle.addVoador(aviao);
		torreDeControle.addVoador(superHomem);
		
		torreDeControle.voemTodos();
		torreDeControle.voemTodos();
		torreDeControle.voemTodos();
	}

}
