package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_22_desafio_polimorfismo_e_classes_abstratas;

public abstract class Conta {

    protected SituacaoConta situacaoConta;
    private String descricao;
    private Double valor;
    private String dataVencimento;

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public abstract void exibirDetalhes();
    public void cancelar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi paga: " + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao() + ".");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public SituacaoConta getSituacaoConta() {
        return this.situacaoConta;
    }
}