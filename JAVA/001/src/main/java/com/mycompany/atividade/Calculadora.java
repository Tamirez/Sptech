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
public class Calculadora {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número?");
        Double numero1 = leitor.nextDouble();

        System.out.println("Insira outro número?");
        Double numero2 = leitor.nextDouble();

        Double soma = numero1 + numero2;
        Double subtracao = numero1 - numero2;
        Double multiplicacao = numero1 * numero2;
        Double divisao = numero1 / numero2;

        System.out.println("Resultado da soma: " + soma
                + " Resultado da subtração: " + subtracao
                + " Resultado da multiplicação: " + multiplicacao
                + " Resultado da divisão: " + divisao);

    }

}
