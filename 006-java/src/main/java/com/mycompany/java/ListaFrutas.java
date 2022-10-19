/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tamirez
 */
public class ListaFrutas {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<String> frutas = new ArrayList();

        frutas.add("Figo");
        frutas.add("Morango");
        frutas.add("Tâmara");
        frutas.add("Cereja");
        frutas.add("Manga");
        frutas.add("Maça");
        frutas.add("Amora");
        frutas.add("Framboesa");

        System.out.println("Digite o nome de uma fruta e busque na lista: ");
        String frutaDigitada = leitor.nextLine();

        String resultado = "A fruta " + frutaDigitada + " não existe na lista."; // CONDIÇÃO "FALSA"

        for (int i = 0; i < frutas.size(); i++) {

            if (frutaDigitada.equalsIgnoreCase(frutas.get(i))) // STRING SE USA EQUALS
            {
                // SE A CONDIÇÃO FOR "VERDADEIRA", A STRING RESULTADO VAI TROCAR A FRASE PELA CONDIÇÃO "VERDADEIRA" 
                resultado = "A fruta " + frutaDigitada + " existe na lista."; // → CONDIÇÃO "VERDADEIRA" 

            }

        }

        System.out.println(resultado);
    }
}
