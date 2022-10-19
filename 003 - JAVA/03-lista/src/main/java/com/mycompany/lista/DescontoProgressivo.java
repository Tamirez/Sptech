/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista;

/**
 *
 * @author Tamirez
 */
public class DescontoProgressivo {

    Double calcularDesconto(Double dez) { // CALCULO PARA OBTER o desconto de 10%
        Double descontodez = dez - (dez * 0.1);  // 
        return descontodez;
    }

    Double calcularDesconto2(Double vinte) { // CALCULO PARA OBTER o desconto de 20%
        Double descontovinte = vinte - (vinte * 0.2);  // 
        return descontovinte;
    }

    Double calcularDesconto3(Double trinta) { // CALCULO PARA OBTER o desconto de 30%
        Double descontotrinta = trinta - (trinta * 0.3);  // 
        return descontotrinta;

    }

}
