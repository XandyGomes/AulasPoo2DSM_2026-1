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
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Código do funcionário: ");
        int cod = leitor.nextInt();
        System.out.print("Porcentagem do INSS (%): ");
        double porc = leitor.nextDouble();
        System.out.print("Salário bruto (R$): ");
        double sal = leitor.nextDouble();

        DadosFuncionario func = new DadosFuncionario();
        CalculadoraINSS calc = new CalculadoraINSS();

        calc.setPorcentagemINSS(porc);
        func.setCodigoFuncionario(cod);
        func.setSalarioBruto(sal);

        double desconto = calc.calcularDescontoINSS(func.getSalarioBruto());
        double vale = func.calcularValeAlimentacao();
        double liquido = func.getSalarioBruto() - desconto + vale;

        System.out.println("\n=== RESUMO FOLHA ===");
        System.out.println("Código do funcionário: " + func.getCodigoFuncionario());
        System.out.printf("Salário bruto: R$ %.2f\n", func.getSalarioBruto());
        System.out.printf("Desconto INSS (%.2f%%): R$ %.2f\n", calc.getPorcentagemINSS(), desconto);
        System.out.printf("Vale-alimentação: R$ %.2f\n", vale);
        System.out.printf("Salário liquido (Total a receber): R$ %.2f\n", liquido);

    }
}
