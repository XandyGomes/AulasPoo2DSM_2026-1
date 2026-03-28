/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBancaria;

/**
 *
 * @author Alexandre
 */
public class TestaConta {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.inicializar(123, 100.0);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.inicializar(456, 50.0);

        System.out.println("Saldo inicial Conta1: " + conta1.getSaldo());
        System.out.println("Saldo inicial Conta2: " + conta2.getSaldo());

        conta1.depositar(50.0);

        System.out.println("Saldo após depósito Conta1: " + conta1.getSaldo());

        conta1.sacar(20.0);

        System.out.println("Saldo após saque Conta1: " + conta1.getSaldo());

        conta1.transferir(30.0, conta2);

        System.out.println("Saldo de Conta1 após transferência da Conta1 para Conta2: " + conta1.getSaldo());
        System.out.println("Saldo da Conta2 após transferência da Conta1 para Conta2: " + conta2.getSaldo());
    }
}
