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
public class CalculoMedia {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Qual sua 1ª nota: ");
        Double primeira = leitor.nextDouble();
        
        System.out.println("Qual sua 2ª nota: ");
        Double segunda = leitor.nextDouble();
        
        Double media = (primeira + segunda) / 2;
        
        System.out.println("Olá, " + nome + ".Sua média foi de:" + media);
   
    }
    
}
