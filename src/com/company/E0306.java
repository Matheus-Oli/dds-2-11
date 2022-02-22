package com.company;

import java.util.Scanner;

public class E0306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Ola " + nome + " " + sobrenome + "!");

        scanner.close();
    }
}
