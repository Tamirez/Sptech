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
public class Administrador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome de usuário:");
        String usuario = leitor.next();

        System.out.println("Digite a senha:");
        String senha = leitor.next();

        while (!senha.equals("#Bandtec") && !usuario.equals("admin")) {
            // o ! antes da variavel signica que vai inverter a condição de true para false ou vice versa
            System.out.println("SENHA E/OU USUÁRIO INVÁLIDOS, DIGITE NOVAMENTE");

            System.out.println("Digite o nome de usuário:");
            usuario = leitor.next();

            System.out.println("Digite a senha:");
            senha = leitor.next();
        }

        System.out.println("LOGIN EFETUADO COM SUCESSO!");
    }
}
