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
public class TesteClassificaIdade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // SOLICITANDO A IDADE DO USUARIO ↓
        System.out.println("Digite uma idade:");
        int idade = leitor.nextInt();

        if (idade < 2) {
            System.out.println("Bebê");

        } else if (idade > 2 || idade <= 11) {
            System.out.println("Criança");

        } else if (idade > 11 || idade <= 19) {
            System.out.println("Adolescente");

        } else if (idade > 19 || idade <= 30) {
            System.out.println("Jovem");

        } else if (idade > 30 || idade <= 60) {
            System.out.println("Adulto");

        } else {
            System.out.println("Idoso");

        }

    }

}
