/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulaspoo2dsm;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class CalcAltura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double maiorAltura = 0.0;
        double menorAltura = 99.9;
        double somaAlturasHomens = 0.0;
        int numMulheres = 0;
        int numHomens = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a altura da pessoa " + i + ": ");
            double altura = input.nextDouble();
            System.out.println("Digite o sexo da pessoa " + i + " (M/F): ");
            String sexo = input.next();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (sexo.equals("M") || sexo.equals("m")) {
                somaAlturasHomens += altura;
                numHomens = numHomens + 1;
            } else if (sexo.equals("F") || sexo.equals("f")) {
                numMulheres++;
            }
        }
        
        double mediaAlturasHomens = somaAlturasHomens / numHomens;
        System.out.println("Maior altura: "+maiorAltura);
        System.out.println("Menor altura: "+menorAltura);
        System.out.println("Média de altura dos homens: "+mediaAlturasHomens);
        System.out.println("Número de mulheres: "+numMulheres);

    }
}
