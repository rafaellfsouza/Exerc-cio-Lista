/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperaturasmensais;

import java.util.Scanner;

public class TemperaturasMensais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nomes dos meses
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        double[] temperaturas = new double[12];

        // Leitura das temperaturas
        System.out.println("Digite a temperatura média de cada mês:");

        for (int i = 0; i < 12; i++) {
            while (true) {
                System.out.print(meses[i] + ": ");
                try {
                    temperaturas[i] = scanner.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    scanner.nextLine(); // Limpa o buffer
                }
            }
        }

        // Cálculo da média anual
        double soma = 0;
        for (double temp : temperaturas) {
            soma += temp;
        }

        double mediaAnual = soma / temperaturas.length;

        // Exibição das temperaturas acima da média
        System.out.printf("\nMédia anual das temperaturas: %.2f°C\n", mediaAnual);
        System.out.println("\nTemperaturas acima da média anual:");

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.printf("%s: %.2f°C\n", meses[i], temperaturas[i]);
            }
        }

        scanner.close();
    }
}