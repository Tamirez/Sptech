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
public class Calorias {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos minutos de aquecimento?");
        Integer aquecimento = leitor.nextInt();
        
        System.out.println("Quantos minutos de exercícios aeróbicos?");
        Integer aerobico = leitor.nextInt();
        
        System.out.println("Quantos minutos de exercícios de musculação?");
        Integer musculacao = leitor.nextInt();
        
        Integer valor1 = 12;
        Integer valor2 = 20;
        Integer valor3 = 25;
        
        Integer total1 = valor1 * aquecimento;
        Integer total2 = valor2 * aerobico;
        Integer total3 = valor3 * musculacao;
        
        
        System.out.println ("Olá Jorge! Você fez um total de " + 
                (aquecimento + aerobico + musculacao) +
                " minutos de exercícios e perdeu cerca de " + 
                (total1 + total2 + total3) + 
                " calorias!");
        
}
    
}
