/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoEscolar;

/**
 *
 * @author Alexandre
 */
public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String matricula, String nome, String dataNascimento, String endereco) {
        super(nome, dataNascimento, endereco);
        this.matricula = matricula;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
