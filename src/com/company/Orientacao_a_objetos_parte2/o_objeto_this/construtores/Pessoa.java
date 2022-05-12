package com.company.Orientacao_a_objetos_parte2.o_objeto_this.construtores;
public class Pessoa {
    String nome;
    int idade;
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }
}
