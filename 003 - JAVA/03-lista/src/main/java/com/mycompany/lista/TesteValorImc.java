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
public class TesteValorImc {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Instânciando a classe Utilitaria
        //Criando um objeto ↓
        ValorImc apelidoTeste = new ValorImc();

        // SOLICITANDO O SEXO ↓
        System.out.println("Digite o seu sexo:");
        Integer sexo = leitor.nextInt();

        // SOLICITANDO A ALTURA ↓
        System.out.println("Digite a sua altura:");
        double altura = leitor.nextDouble();

        double resultadof = apelidoTeste.calculaPesoIdeal(altura);
        double resultadom = apelidoTeste.calculaPesoIdeal2(altura);
        
        
        if (sexo == feminino) {
            System.out.println("O peso ideal é de" + resultadof + " Kg");

        } else {
            System.out.println("O peso ideal é de" + resultadom + " Kg");

        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }

}
