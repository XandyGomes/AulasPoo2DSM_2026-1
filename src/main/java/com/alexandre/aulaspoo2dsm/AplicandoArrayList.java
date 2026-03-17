/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulaspoo2dsm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class AplicandoArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int[] array = new int[5];
        ArrayList<Integer> array = new ArrayList();
        double soma = 0.0;
        double media = 0.0;
        int num = 0;
//        int numArray = 0;

        System.out.println("Qual a quantidade de numeros a serem inseridos: ");
        num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
//            array[i] = input.nextInt();
//            numArray = input.nextInt(); 
            array.add(input.nextInt());
            soma += array.get(i);
        }

        for (int numero : array) {
            System.out.println(numero);
        }

        media = soma / array.size();
        System.out.printf("\nMédia: %.2f", media);

    }
}
