package com.company;
import java.util.Scanner;
public class QuadradoDeUmNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        Integer numero = scanner.nextInt();

        Integer quadrado = numero * numero;

        System.out.println("O quadrado de " + numero + " e " + quadrado + ".");

        scanner.close();

    }
}
