package br.com.mariojp.cinema;

import java.util.ArrayList;
import java.util.List;

public class SalaCinema {

	private List<Filas> filas;

	public SalaCinema() {

	}

	public SalaCinema(int _linha, int _coluna) {
		MontarSala(_linha, _coluna);
	}

	private void MontarSala(int _linha, int _coluna) {
		filas = new ArrayList<>();
		for (int j = 0; j < _linha; j++) {

			Filas fila = new Filas(j + 1, _coluna);
			filas.add(fila);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("  ");
		for (int i = 1; i <= filas.get(0).getNumeroAssentos(); i++) {
			sb.append(i + " ");
		}
		sb.append("\n");
		for (Filas filas2 : filas) {
			sb.append(filas2.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
