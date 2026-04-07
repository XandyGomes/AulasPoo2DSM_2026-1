/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author Alexandre
 */
public class TesteGestAluguel {
    public static void main(String[] args) {
        GestAluguelCarro locacao = new GestAluguelCarro();
        
        locacao.inicializar("VW Polo 2024", 150.0);
        
        locacao.retirarCarro(12500);
        
        int dias = 5 ;
        
        locacao.devolverCarro(13200);
        
        System.out.println("\n--- Resumo do Aluguel ---");
        System.out.println("Veículo: "+ locacao.getModelo());
        System.out.println("Valor da Diária: R$ "+locacao.getValorDiaria());
        System.out.println("Total a pagar por "+dias+" dias: R$ "+locacao.calcularValorTotal(dias));
        System.out.println("Status de locação: " + (locacao.isAlugado() ? "Alugado" : "Disponível"));

    }
}
