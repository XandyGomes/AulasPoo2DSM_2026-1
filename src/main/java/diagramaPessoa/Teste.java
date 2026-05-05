/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaPessoa;

/**
 *
 * @author Alexandre
 */
public class Teste {
    public static void main(String[] args) {
        Colaborador c1 = new Colaborador();
        
        c1.setNome("Alexandre");
        c1.setBairro("Centro");
        c1.setLogradouro("Rua Floriano Peixoto");
        c1.setNumero(1680);
        c1.setNasc(03, 10, 1980);
        
        Parceiro p1 = new Parceiro();
        p1.setNome("Fatec");
        p1.setUf("SP");
        p1.setCnpj("13246578943");
        p1.setFundacao("01/01/2000");
        
        System.out.println("Rua do colaborador " + c1.getNome() + ": " + c1.getLogradouro() +", nº " + c1.getNumero());
        System.out.println("Data de nascimento do colaborador " + c1.getNome() + ": " + c1.getNasc());
        
        System.out.println("CNPJ da empresa " + p1.getNome() + ": " + p1.getCnpj());
        
    }
}
