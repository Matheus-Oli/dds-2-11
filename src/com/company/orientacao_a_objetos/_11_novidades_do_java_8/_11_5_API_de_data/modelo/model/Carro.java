package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_5_API_de_data.modelo.model;

import java.time.Year;

public class Carro {

    private String modelo;
    private double valorDiaria;
    private Year anoFabricacao;

    public Carro(String modelo, double valorDiaria, Year anoFabricacao) {
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Year getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Year anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}