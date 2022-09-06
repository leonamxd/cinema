package br.com.mariojp.cinema;

import java.util.ArrayList;
import java.util.List;

public class Filas {

	private int numero;
	private List<Assentos> assentos;

	public Filas() {
	}

	public Filas(int _numero, int _coluna) {
		assentos = new ArrayList<>();
		this.numero = _numero;
		MontarFila(_coluna);
	}

	public void MontarFila(int _coluna) {
		for (int i = 0; i < _coluna; i++) {
			Assentos assento = new Assentos(i + 1);
			assentos.add(assento);
		}
	}

	public int getNumeroAssentos() {
		return assentos.size();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(numero);
		sb.append(" ");
		for (Assentos assentos2 : assentos) {
			sb.append(assentos2 + " ");
			
		}
		return sb.toString();
	}
}
