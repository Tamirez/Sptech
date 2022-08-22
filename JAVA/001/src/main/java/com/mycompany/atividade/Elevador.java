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
public class Elevador {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o limite de peso do elevado?");
        Integer peso = leitor.nextInt();
        
        System.out.println("Qual o limite de pessoas no elevador?");
        Integer pessoa = leitor.nextInt();
        
        System.out.println("Qual o peso da 1ª pessoa que entrou no elevador?");
        Integer um  = leitor.nextInt();
        
        System.out.println("Qual o peso da 2ª pessoa que entrou no elevador?");
        Integer dois = leitor.nextInt();
        
        System.out.println("Qual o peso da 3ª pessoa que entrou no elevador?");
        Integer tres = leitor.nextInt();
        
        Integer capacidade = um + dois + tres;
        
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " 
        + pessoa + " pessoas. O peso total no elevador é de " + capacidade + 
        ", sendo que ele suporta " + peso);
        
        
        
    }
    
}
