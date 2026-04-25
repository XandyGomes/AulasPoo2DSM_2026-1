/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.correcaoprova;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Temperatura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double C = input.nextDouble();

        double F = C * 1.8 + 32;
        double K = C + 273.15;
        double Re = C * 0.8;
        double Ra = C * 1.8 + 32 + 459.67;

        System.out.printf("Fahrenheit: %.2fºF\n", F);
        System.out.printf("Kelvin: %.2fK\n", K);
        System.out.printf("Réaumur: %.2fºRé\n", Re);
        System.out.printf("Rankine: %.2fºR\n", Ra);
    }
}
