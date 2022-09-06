package br.com.mariojp.cinema;

public class Principal {

	public static void main(String[] args) {

		int linha = 7;
		int coluna = 8;
		
		SalaCinema sala = new SalaCinema(linha, coluna);
		
		System.out.println(sala);
	}

}
