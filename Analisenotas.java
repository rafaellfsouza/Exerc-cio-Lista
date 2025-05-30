/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.analisenotas;

import java.util.ArrayList;
import java.util.Scanner;

public class AnaliseNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (digite -1 para encerrar):");

        double nota;

        // Leitura das notas
        while (true) {
            System.out.print("Nota: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Digite um número.");
                System.out.print("Nota: ");
                scanner.next(); // Limpa entrada inválida
            }

            nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            notas.add(nota);
        }

        // 1. Mostrar quantidade de valores lidos
        System.out.println("\nQuantidade de valores lidos: " + notas.size());

        // 2. Exibir todos os valores na ordem original
        System.out.println("Valores na ordem original:");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 3. Exibir valores na ordem inversa, um abaixo do outro
        System.out.println("Valores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        // 4. Calcular e mostrar soma dos valores
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        System.out.println("Soma dos valores: " + soma);

        // 5. Calcular e mostrar média dos valores
        double media = 0;
        if (!notas.isEmpty()) {
            media = soma / notas.size();
        }
        System.out.printf("Média dos valores: %.2f\n", media);

        // 6. Contar quantos valores estão acima da média
        int acimaDaMedia = 0;
        for (double n : notas) {
            if (n > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);

        // 7. Contar quantos valores estão abaixo de 7
        int abaixoDeSete = 0;
        for (double n : notas) {
            if (n < 7) {
                abaixoDeSete++;
            }
        }
        System.out.println("Quantidade de valores abaixo de 7: " + abaixoDeSete);

        // Mensagem final
        System.out.println("Programa encerrado. Obrigado!");
        
        scanner.close();
    }
}