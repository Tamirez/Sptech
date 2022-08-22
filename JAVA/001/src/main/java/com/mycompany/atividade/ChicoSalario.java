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
public class ChicoSalario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira seu salário bruto:");
        Double bruto = leitor.nextDouble();

        System.out.println("Insira o valor da condução diária só de ida da sua casa para o trabalho:");
        Double conducao = leitor.nextDouble();

       Double desconto = bruto * 0.30;
       Double transporte = conducao * 2 * 22;
       Double total = desconto + transporte;
       Double resto = bruto - total;
       
        
        System.out.println("Seu salário bruto é R$ " + bruto + " tem um total de R$ " + total + " em descontos e receberá um líquido de R$ " + resto);

    }

}
