
package com.mycompany.lancheria;

import java.util.Scanner;


public class Lancheria {

    public static void main(String[] args) {

        int pedido, quantidade;
        double total;

        Scanner teclado = new Scanner(System.in);
        System.out.println("escolha seu lanche");

        pedido = teclado.nextInt();

        if (pedido == 1) {

            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 4.00;
            System.out.print("Seu cachorro quente saiu: R$" + total);

        } else if (pedido == 2) {

            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 4.50;
            System.out.printf("Seu x salada saiu: R$%.2f", total);

        } else if (pedido == 3) {

            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 5.00;
            System.out.printf("Seu x bacon  saiu: R$%.2f", total);

        } else if (pedido == 4) {

            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 2.00;
            System.out.printf("Sua torrada simples saiu: R%.2f",total);

        } else if (pedido == 5) {

            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 3.00;
            System.out.printf("seu refrigerante esta aqui : R%.2f",total);

        }
    }
}
