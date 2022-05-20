package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2.classes_abstratas_5_21;
public class ProdutoPerecivel extends Produto{
    String dataValidade;
    @Override
    public void imprimirDescricao() {
        System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
    }
}
