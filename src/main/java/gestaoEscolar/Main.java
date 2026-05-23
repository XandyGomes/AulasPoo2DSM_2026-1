/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoEscolar;

/**
 *
 * @author Alexandre
 */
public class Main {
    public static void main(String[] args) {
        Secretaria secretaria = new Secretaria();
        DiarioDeClasse diarioDeClasse = new DiarioDeClasse();
    
        Professor professor1 = new Professor("PROF123", "Alexandre", "03/10/1980", "Rua A, 123");
        Professor professor2 = new Professor("PROF321", "Neto", "01/12/1930", "Rua B, 321");
        
        Disciplina disciplina1 = new Disciplina("Matemática", 80, professor1);
        Disciplina disciplina2 = new Disciplina("Português", 120, professor2);
        
        Turma turmaA = new Turma("TURMA-A", 2024, professor1, disciplina1);
        Turma turmaB = new Turma("TURMA-B", 2024, professor2, disciplina2);
        
        Aluno aluno1 = new Aluno("2024001", "Maria Souza", "02/05/98", "Rua B, 456");
        Aluno aluno2 = new Aluno("2024002", "Pedro Santos", "03/04/92", "Rua C, 758");
        Aluno aluno3 = new Aluno("2024003", "José Amaral", "01/02/90", "Rua D, 987");
    
        secretaria.matricular(aluno1, turmaA);
        secretaria.matricular(aluno2, turmaA);
        secretaria.matricular(aluno3, turmaB);
        
        diarioDeClasse.registrarNota(aluno1, disciplina1, 9.5);
        diarioDeClasse.registrarFrequencia(aluno1, disciplina1, true);
        
        diarioDeClasse.registrarNota(aluno2, disciplina1, 7.0);
        diarioDeClasse.registrarFrequencia(aluno2, disciplina1, false);
        
        diarioDeClasse.registrarNota(aluno3, disciplina2, 6.0);
        diarioDeClasse.registrarFrequencia(aluno3, disciplina2, true);        
        
        System.out.println("Alunos matriculados na turma " + turmaA.getCodigo() + ": ");
        for(Aluno aluno: turmaA.getAlunos()){
            System.out.println("- " + aluno.getNome() + "(Matrícula: "+aluno.getMatricula() + ")");
        }
        System.out.println("Alunos matriculados na turma " + turmaB.getCodigo() + ": ");
        for(Aluno aluno: turmaB.getAlunos()){
            System.out.println("- " + aluno.getNome() + "(Matrícula: "+aluno.getMatricula() + ")");
        }
        System.out.println("\nNotas do aluno " + aluno1.getNome() + " em " + disciplina1.getNome() + ":");
        for(Double nota : diarioDeClasse.getNotas(aluno1, disciplina1)){
            System.out.println("- " + nota);
        }
        System.out.println("\nNotas do aluno " + aluno2.getNome() + " em " + disciplina1.getNome() + ":");
        for(Double nota : diarioDeClasse.getNotas(aluno2, disciplina1)){
            System.out.println("- " + nota);
        }
        System.out.println("\nNotas do aluno " + aluno3.getNome() + " em " + disciplina2.getNome() + ":");
        for(Double nota : diarioDeClasse.getNotas(aluno3, disciplina2)){
            System.out.println("- " + nota);
        }
        System.out.println("\nFrequências do aluno" + aluno1.getNome() + " em " + disciplina1.getNome() + ":");
        for(Boolean presente : diarioDeClasse.getFrequencias(aluno1, disciplina1)){
            System.out.println("- " + (presente ? "Presente" : "Ausente"));
        }
        System.out.println("\nFrequências do aluno" + aluno2.getNome() + " em " + disciplina1.getNome() + ":");
        for(Boolean presente : diarioDeClasse.getFrequencias(aluno2, disciplina1)){
            System.out.println("- " + (presente ? "Presente" : "Ausente"));
        }
        System.out.println("\nFrequências do aluno" + aluno3.getNome() + " em " + disciplina2.getNome() + ":");
        for(Boolean presente : diarioDeClasse.getFrequencias(aluno3, disciplina2)){
            System.out.println("- " + (presente ? "Presente" : "Ausente"));
        }
    }
}
