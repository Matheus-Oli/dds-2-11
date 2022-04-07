package com.company.iteracao;

public class IteracaoFor {
    public static void main(String[] args) {
        Integer[] produtos = new Integer[] { 100, 225, 300 };

        for (int i = 0; i < produtos.length; i++) {
            Integer produto = produtos[i];

            System.out.printf("Produto de código: " + produto);

            if (produto.equals(225)) {
                System.out.printf("Produto encontrado!");
                break;
            }
        }
    }
}
