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
public class TesteDescontoProgressivo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Instânciando a classe Utilitaria
        //Criando um objeto ↓
        DescontoProgressivo apelidoDesconto = new DescontoProgressivo();

        // SOLICITANDO O PREÇO ↓
        System.out.println("Bem Vindo ao sistema de desconto progressivo! /n");
        System.out.println("Digite o valor unitário do produto:");
        double preco = leitor.nextDouble();

        // SOLICITANDO A QUANTIDADE↓
        System.out.println("Digite a quantidade:");
        int quantidade = leitor.nextInt();

        System.out.println("Valor do produto: R$" + preco);
        System.out.println("Quantidade: " + quantidade);

        double total = quantidade * preco;

        double resultado = apelidoDesconto.calcularDesconto(total);
        double resultado2 = apelidoDesconto.calcularDesconto2(total);
        double resultado3 = apelidoDesconto.calcularDesconto3(total);

        if (quantidade == 1) {
            System.out.println("Valor com desconto: R$" + resultado);

        } else if (quantidade == 2) {
            System.out.println("Valor com desconto: R$" + resultado2);

        } else {
            System.out.println("Valor com desconto: R$" + resultado3);

        }

    }

}
