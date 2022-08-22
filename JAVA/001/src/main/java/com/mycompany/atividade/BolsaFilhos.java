/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class BolsaFilhos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantidade de filhos de 0 a 3 anos");
        Integer crianca = leitor.nextInt();

        System.out.println("Quantidade de filhos de 4 a 16 anos");
        Integer adolescente = leitor.nextInt();

        System.out.println("Quantidade de filhos de 17 a 18 anos");
        Integer adulto = leitor.nextInt();

        Double valor1 = 25.12;
        Double valor2 = 15.88;
        Double valor3 = 12.44;

        Double total1 = valor1 * crianca;
        Double total2 = valor2 * adolescente;
        Double total3 = valor3 * adulto;

        System.out.println("Você tem um total de "
                + (crianca + adolescente + adulto) + " filhos e vai receber R$"
                + (total1 + total2 + total3) + " de bolsa");

    }

}
