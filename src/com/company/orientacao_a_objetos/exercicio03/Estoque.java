package com.company.orientacao_a_objetos.exercicio03;
public class Estoque {
    Produto[] produtos;
    void listarProdutos() {
        System.out.println("Produtos em estoque");
        System.out.println("-------------------");
        for (int i = 0; i < produtos.length; i++) {
            produtos[i].descrever();
        }
    }
}
