/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author tamirez
 */
public class RecursosHumanos {
    
    private Integer totalSalReajuste; //CONTADOR DE QUANTOS REAJUSTES FORAM FEITOS NO MES (++)
    private Integer totalPromovido;  //CONTADOR DE QUANTOS PROMOVIDOS FORAM FEITOS NO MES (++)

    // O apelidoColaborador chama a classe Colaborador e pega atributos e metodos que eu coloquei lá
    // Double reajustSal é a variavel do reajuste
    
    void reajustarSalario(Colaborador apelidoColaborador, Double reajustSal) {
        totalSalReajuste++;
        Double novoSalario = apelidoColaborador.getSalario() + reajustSal;
        apelidoColaborador.setSalario(novoSalario);
        
    }
    
}
