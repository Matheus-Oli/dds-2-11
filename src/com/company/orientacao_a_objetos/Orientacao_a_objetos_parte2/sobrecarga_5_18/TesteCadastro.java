package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2.sobrecarga_5_18;
public class TesteCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("José", 32);
        cadastro.cadastrar(pessoa);
        cadastro.cadastrar("Maria", 25);
    }
}
