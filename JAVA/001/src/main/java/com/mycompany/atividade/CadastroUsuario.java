/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author MAciel
 */
public class CadastroUsuario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo \n"
                + "Login: ");
        String login = leitor.nextLine();

        System.out.println("Senha: ");
        String senha = leitor.nextLine();

        System.out.println("Quantidade de erros antes do bloqueio: ");
        Integer qtdBloq = leitor.nextInt();

        System.out.println("Seu login é " + login + " e sua senha é " + senha
            + ". Você tem " + qtdBloq + " tentativas antes de ser bloqueado");
    }
}
