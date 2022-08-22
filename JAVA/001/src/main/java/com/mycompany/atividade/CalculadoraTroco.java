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
public class CalculadoraTroco {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o valor unitário de um produto?");
        Double produto = leitor.nextDouble();

        System.out.println("Qual a quantidade vendida?");
        Double quantidade = leitor.nextDouble();

        System.out.println("Qual o valor pago pelo cliente?");
        Double preco = leitor.nextDouble();

        Double valor1 = produto * quantidade;
        Double valor2 = preco - valor1;

        System.out.println("Seu troco será de R$ " + valor2);
    }

}
