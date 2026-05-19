/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoEscolar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Secretaria implements Matriculavel{

    private List<Matricula> matriculas = new ArrayList();
    
    @Override
    public void matricular(Aluno aluno, Turma turma) {
        //verificar se o aluno já esta matriculado na turma
        for(Matricula matricula : matriculas){
           
        }
    }

    @Override
    public void cancelarMatricular(Aluno aluno, Turma turma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
