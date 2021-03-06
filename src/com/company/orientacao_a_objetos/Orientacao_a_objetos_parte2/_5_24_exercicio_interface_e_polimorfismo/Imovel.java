package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_24_exercicio_interface_e_polimorfismo;

public class Imovel implements Seguravel {

	private double valorMercado;
	private int areaConstruida;

	public Imovel(double valorMercado, int areaConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	public String obterDescricao() {
		return "Imóvel com área construída de " + this.areaConstruida + "m2 e valor de mercado " 
			+ this.valorMercado;
	}

	public double calcularValorApolice() {
		// cálculos fictícios do valor de uma apólice de um imóvel
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.5);
		return valorApolice;
	}

}