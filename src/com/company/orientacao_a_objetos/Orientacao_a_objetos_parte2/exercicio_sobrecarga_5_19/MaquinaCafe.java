package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2.exercicio_sobrecarga_5_19;
public class MaquinaCafe {
    public int acucarDisponivel;
    public void fazerCafe() {
        fazerCafe(10);
    }
    public void fazerCafe(int quantidadeAcucar) {
        if (acucarDisponivel < quantidadeAcucar){
            System.out.println("Não há açucar suficiente para fazer seu café.");
        } else {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
        }
    }
}
