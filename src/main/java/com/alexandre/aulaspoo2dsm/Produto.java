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
public class Produto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double n1, n2, n3, result;
        
        System.out.println("Digite o primeiro numero: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = entrada.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        n3 = entrada.nextDouble();
        
        result = n1*n2*n3;
        
        System.out.printf("O Resultado dos numeros %.2f, %.2f, %.2f, é : %.2f", n1,n2,n3,result);
        
    }
}
