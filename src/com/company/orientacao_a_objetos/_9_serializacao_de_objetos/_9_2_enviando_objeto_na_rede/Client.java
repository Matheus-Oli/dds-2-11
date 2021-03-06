package com.company.orientacao_a_objetos._9_serializacao_de_objetos._9_2_enviando_objeto_na_rede;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 3333);

        OutputStream saida = socket.getOutputStream();
        ObjectOutput objectOutput = new ObjectOutputStream(saida);

        Pedido pedido = new Pedido();
        pedido.setCodigo(2L);
        pedido.setDescricao("Pasta de dente");
        pedido.setQuantidade(2);

        objectOutput.writeObject(pedido);

        InputStream entrada = socket.getInputStream();
        DataInputStream dataInput = new DataInputStream(entrada);
        System.out.println("Recebeu do servidor: " + dataInput.readUTF());

        socket.close();

    }
}