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
public class Idade {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu nome meu jovem?");
        String nome = leitor.nextLine();
        
        System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento?");
        Integer ano = leitor.nextInt();
        
        Integer futuro = 2030 - ano;
        
        System.out.println("Em 2030 você terá " + futuro + " anos");
    
    }
}
