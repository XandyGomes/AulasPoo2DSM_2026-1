/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentoBiblioteca;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class Funcionario extends Pessoa{
    private String cargo;

    public Funcionario(String cargo, String nome, Date dataNascimento, String endereco, String telefone, String email) {
        super(nome, dataNascimento, endereco, telefone, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
   
}
