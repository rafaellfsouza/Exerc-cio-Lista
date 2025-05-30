/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.investigacaocrime;

import java.util.Scanner;
import java.util.ArrayList;

public class InvestigacaoCrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lista de perguntas
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        ArrayList<String> respostas = new ArrayList<>();

        System.out.println("Responda às perguntas com 'S' para Sim ou 'N' para Não.");

        // Leitura das respostas
        for (String pergunta : perguntas) {
            System.out.print(pergunta + " ");
            String resposta = scanner.nextLine().toUpperCase();

            while (!resposta.equals("S") && !resposta.equals("N")) {
                System.out.println("Resposta inválida! Digite 'S' para Sim ou 'N' para Não.");
                System.out.print(pergunta + " ");
                resposta = scanner.nextLine().toUpperCase();
            }

            respostas.add(resposta);
        }

        // Conta quantas respostas foram "S"
        int contadorSim = 0;
        for (String resposta : respostas) {
            if (resposta.equals("S")) {
                contadorSim++;
            }
        }

        // Classificação final
        String classificacao;
        switch (contadorSim) {
            case 2:
                classificacao = "Suspeita";
                break;
            case 3:
            case 4:
                classificacao = "Cúmplice";
                break;
            case 5:
                classificacao = "Assassino";
                break;
            default:
                classificacao = "Inocente";
                break;
        }

        System.out.println("\nClassificação: " + classificacao);

        scanner.close();
    }
}