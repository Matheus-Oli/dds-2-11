package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_3_interfaces_funcionais.teste;

import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_3_interfaces_funcionais.compra.Compra;
import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_3_interfaces_funcionais.impressao.Impressora;

public class Teste {

    public static void main(String[] args) {
      //Impressora i = new ImpressoraHP();

        Impressora i = (c) -> {
            System.out.println("Simulando a impressão, Seria impresso: " + c);
        };

        Compra compra = new Compra("Sabonete", 2.5);
        i.imprimir(compra);
    }
}
