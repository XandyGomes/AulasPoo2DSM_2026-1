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
public class Leitor extends Pessoa{
    private String codigo;

    public Leitor(String codigo, String nome, Date dataNascimento, String endereco, String telefone, String email) {
        super(nome, dataNascimento, endereco, telefone, email);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
