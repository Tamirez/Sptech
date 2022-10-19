/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista;

import java.util.Scanner;

/**
 *
 * @author Tamirez
 */
public class CalcularMediaTeste {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // 
        CalcularMedia media = new CalcularMedia();

        double numero1 = 0; // NUMERO QUE O USUARIO VAI DIGITAR
        double numero2 = 0; // NUMERO QUE O USUARIO VAI DIGITAR

        System.out.println("Digite o 1º numero ");
        numero1 = leitor.nextDouble();

        System.out.println("Digite o 2º numero ");
        numero2 = leitor.nextDouble();

        // CRIOU A VARIAVEL numdigitado PARA GUARDAR OS NOVOS VALORES
        // media.media é o valor declarado no CALCULARMEDIA E NO NEW LÁ EM CIMA
        double numdigitado = media.media(numero1, numero2); // CRIOU A VARIAVEL NUMDIGITADO
        System.out.println(numdigitado);
    }

}


