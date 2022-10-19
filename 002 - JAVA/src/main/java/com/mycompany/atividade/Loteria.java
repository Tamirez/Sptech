/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Tamirez
 */
public class Loteria {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer contagem = 1; // variavel contagem

        System.out.println("Digite um número de 0 à 10: )");
        Integer numeroUser = leitor.nextInt(); // Lê o numero digitado

        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 10);
        System.out.println(numeroAleatorio); // Esse é o número aleatorio

        contagem++; // Soma dos numeros que não foi acerto.

        while (numeroUser != numeroAleatorio) { //enquanto o num do user for diferente
            System.out.println("Digite de novo: "); //do numero aleatorio digitar de novo

            numeroUser = leitor.nextInt();
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(numeroAleatorio); // sai um novo numero aleatorio

            contagem++; // soma a tentativa

        }
        if (numeroUser == numeroAleatorio) { // quando numero user é igu aleatorio
            if (contagem < 3) {
                System.out.println("Você é MUITO sortudo!!");

            }
            if (contagem >= 4 && contagem <= 10) {
                System.out.println("Você é sortudo");

            } else {
                System.out.println("É melhor você parar de apostar e ir trabalhar");
            }
        }

    }
}
