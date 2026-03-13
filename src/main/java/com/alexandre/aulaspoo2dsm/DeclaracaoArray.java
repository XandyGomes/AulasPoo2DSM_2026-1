/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulaspoo2dsm;

/**
 *
 * @author Alexandre
 */
public class DeclaracaoArray {

    public static void main(String[] args) {
        //[] - são inseridos em uma varíavel que referencia um array
        int[] num1 = new int[4];
        num1[0] = 1;
     
        Integer[] num2 = new Integer[5]; 
        num2[0] = 1;
        
        String[] text = new String[5];
        text[0] = "Teste";

        int[] b;
        b = new int[10];
        
        int[] r = new int[44], k = new int[23];
        
        int[] iniciaValores = {12, 32, 54, 6, 8, 64, 9};
        
        int[] meuArray;
        
        meuArray = new int[10];
        
        meuArray[0] = 100;
        meuArray[1] = 200;
        meuArray[2] = 300;
        meuArray[3] = 400;
        meuArray[4] = 500;
        meuArray[5] = 600;
        meuArray[6] = 700;
        meuArray[7] = 800;
        meuArray[8] = 900;
        meuArray[9] = 1000;
//        meuArray[10] = 1100; // ESTOURA A PILHA;
        
        System.out.println(meuArray[9]);
//        System.out.println(meuArray[10]);
    }
}
