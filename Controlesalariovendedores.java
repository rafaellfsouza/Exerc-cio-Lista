/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlesalariovendedores;

import java.util.Scanner;

public class ControleSalariosVendedores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar a quantidade de vendedores por faixa salarial
        int[] faixas = new int[9]; // 8 faixas normais + 1 para $1000+

        System.out.print("Quantos vendedores deseja registrar? ");
        int totalVendedores = scanner.nextInt();

        for (int i = 0; i < totalVendedores; i++) {
            System.out.printf("Digite as vendas brutas do vendedor %d: ", i + 1);
            double vendasBrutas = scanner.nextDouble();

            // Calcula o salário final
            double salario = 200 + (vendasBrutas * 0.09);

            // Determina qual faixa salarial o vendedor pertence
            if (salario >= 200 && salario <= 299) {
                faixas[0]++;
            } else if (salario >= 300 && salario <= 399) {
                faixas[1]++;
            } else if (salario >= 400 && salario <= 499) {
                faixas[2]++;
            } else if (salario >= 500 && salario <= 599) {
                faixas[3]++;
            } else if (salario >= 600 && salario <= 699) {
                faixas[4]++;
            } else if (salario >= 700 && salario <= 799) {
                faixas[5]++;
            } else if (salario >= 800 && salario <= 899) {
                faixas[6]++;
            } else if (salario >= 900 && salario <= 999) {
                faixas[7]++;
            } else if (salario >= 1000) {
                faixas[8]++;
            }
        }

        // Exibindo os resultados
        System.out.println("\nQuantidade de vendedores por faixa salarial:");
        System.out.println("$200 - $299 : " + faixas[0]);
        System.out.println("$300 - $399 : " + faixas[1]);
        System.out.println("$400 - $499 : " + faixas[2]);
        System.out.println("$500 - $599 : " + faixas[3]);
        System.out.println("$600 - $699 : " + faixas[4]);
        System.out.println("$700 - $799 : " + faixas[5]);
        System.out.println("$800 - $899 : " + faixas[6]);
        System.out.println("$900 - $999 : " + faixas[7]);
        System.out.println("$1000 em diante : " + faixas[8]);

        scanner.close();
    }
}