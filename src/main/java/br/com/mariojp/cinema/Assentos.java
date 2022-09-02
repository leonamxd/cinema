package br.com.mariojp.cinema;

public class Assentos {

	private int numero;
	private double valor;
	private boolean disponivel;
	
	public Assentos(int numero) {
		this.numero = numero;
		disponivel = true;
	}
	
	@Override
	public String toString() {
		return (disponivel ? "S" : "B") + valor;
	}
}
