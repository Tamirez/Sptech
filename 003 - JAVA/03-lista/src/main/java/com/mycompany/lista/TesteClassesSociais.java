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
public class TesteClassesSociais {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // 

        //Instânciando a classe Utilitaria
        //Criando um objeto ↓
        ClassesSociais apelidoclasse = new ClassesSociais();

        // SOLICITANDO A RENDA DO USUARIO ↓
        System.out.println("Digite sua renda:");
        double salario = leitor.nextDouble();

        double resultado = apelidoclasse.calculo(salario); // INVOCANDO O METODO CALCULO
        System.out.println(String.format("Você recebe aproximadamente %.0f sálarios mínimo", resultado));

        if (resultado > 20) {
            System.out.println("Você pertence a classe social A");

        } else if (resultado > 10 || resultado <= 20) {
            System.out.println("Você pertence a classe social B");

        } else if (resultado > 4 || resultado <= 10) {
            System.out.println("Você pertence a classe social C");

        } else if (resultado > 2 || resultado <= 4) {
            System.out.println("Você pertence a classe social D");

        } else {
            System.out.println("Você pertence a classe social E");

        }
    }
}
