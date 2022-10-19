/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author Tamirez
 */
public class Acumulador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer numeroDigitado = leitor.nextInt();

        Integer total = 0;

        while (numeroDigitado != 0) {
            System.out.println("Digite outro número:");
            total += numeroDigitado; // soma dos numeros
            numeroDigitado = leitor.nextInt(); //Chamando a váriavel não coloca o INTEGER
        }

        System.out.println(total);

    }

}
