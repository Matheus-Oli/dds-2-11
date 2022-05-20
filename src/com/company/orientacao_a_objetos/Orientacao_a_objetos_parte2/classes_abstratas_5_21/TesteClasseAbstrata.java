package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2.classes_abstratas_5_21;
public class TesteClasseAbstrata {
    public static void main(String[] args) {
        Produto p = new ProdutoPerecivel();
        p.descricao = "Caixa de Leite";
        ProdutoPerecivel pp = (ProdutoPerecivel) p;
        pp.dataValidade = "10/07/22";
        p.imprimirDescricao();
    }
}
