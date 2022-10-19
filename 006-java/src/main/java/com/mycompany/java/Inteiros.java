/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tamirez
 */
public class Inteiros {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        ArrayList<Integer> numerosDigitados = new ArrayList();

        Integer inteiro = 0;
        Integer somaInteiros = 0;

        do {

            System.out.println("Digite aqui um número inteiro: ");
            inteiro = leitor.nextInt();
            if (inteiro != 0) {

                numerosDigitados.add(inteiro);
            }

        } while (inteiro != 0);

        ////////////////// BLOCO DOS NUMEROS PARES
        for (int i = 0; i < numerosDigitados.size(); i++) { //PARES

            if (numerosDigitados.get(i) % 2 == 0) {
                System.out.println("Números pares da lista: " + numerosDigitados.get(i));
            }
        }
        ////////////////// BLOCO DOS NUMEROS IMPARES
        for (int i = 0; i < numerosDigitados.size(); i++) { //IMPARES

            if (numerosDigitados.get(i) % 2 >= 1) {
                System.out.println("Números impares da lista: " + numerosDigitados.get(i));
            }

        }
        ///////////////////// BLOCO DA SOMA

        for (int i = 0; i < numerosDigitados.size(); i++) { //SOMA
            somaInteiros += numerosDigitados.get(i);

        }
        System.out.println("Soma dos números inteiros: " + somaInteiros);

        ///////////////////// BLOCO DO MAIOR E MENOR
        // COLOQUEI A POSIÇÃO 0 PORQUE JÁ CONTÉM UM ELEMENTO(VALOR) DA LISTA, SE EU COLOCASSE   
        // ZERO, QUALQUER NÚMERO QUE O USÚARIO DIGITASSE NUNCA SERIA MENOR QUE ZERO.
        Integer menorNumero = numerosDigitados.get(0);
        Integer maiorNumero = numerosDigitados.get(0);

        for (int i = 0; i < numerosDigitados.size(); i++) {

            if (numerosDigitados.get(i) < menorNumero) {
                menorNumero = numerosDigitados.get(i);
            }

        }

        System.out.println("O menor número inteiro é: " + menorNumero);

        for (int i = 0; i < numerosDigitados.size(); i++) {

            if (numerosDigitados.get(i) > maiorNumero) {
                maiorNumero = numerosDigitados.get(i);
            }

        }

        System.out.println("O maior número inteiro é: " + maiorNumero);

    }
}
