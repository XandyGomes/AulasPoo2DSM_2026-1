/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author Alexandre
 */
public class TesteConta2 {
    public static void main(String[] args) {
        Conta2 minhaConta1 = new Conta2("Alexandre");
        Conta2 minhaConta2 = new Conta2("Gomes");
        
        System.out.println("Os nomes dentro dos objetos são: "+ minhaConta1.getName() + " " + minhaConta2.getName());
    }
}
