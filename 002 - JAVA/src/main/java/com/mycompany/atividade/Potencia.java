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
public class Potencia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer base = leitor.nextInt();

        System.out.println("Digite outro número: ");
        Integer expoente = leitor.nextInt();

        Integer total = base;

        for (int i = 1; i < expoente; i++) {
            total *= base;
        }
        
        System.out.println(total);
    }

}
