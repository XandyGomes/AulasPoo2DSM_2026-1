/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulaspoo2dsm;

import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class DeclaracaoArrayList {
    public static void main(String[] args) {
        //criando uma ArrayList sem definir o tamanho inicial
        
        ArrayList<String> lista = new ArrayList();
        
        //adicionando elementos à lista
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");
        lista.add("Elemento 5");
        
        //imprimindo elemntos da lista
        for(String elementos : lista){
            System.out.println(elementos);
        }
        System.out.print("\n");
        System.out.println("Apenas a posição de 0: "+ lista.get(0));
        
        //tamanho da lista
        System.out.print("\n");
        System.out.println("Tamanho da lista: " + lista.size());
    }
}
