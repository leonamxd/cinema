package br.com.mariojp.cinema;

public class Assentos {

	private int numero;
	private double valor;
	private boolean disponivel;

	public Assentos() {
	}

	public Assentos(int _numero) {
		this.numero = _numero;
		disponivel = true;
	}

	public Assentos(int _numero, double _valor) {
		this.numero = _numero;
		this.valor = _valor;
		disponivel = true;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return (disponivel ? "S" : "B");
	}
}