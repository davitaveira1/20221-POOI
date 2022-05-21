/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09;

/**
 *
 * @author Davi
 */
public class ex01_Principal {
    
    public static void main(String[] args) {
        ex01_Turma turma1 = new ex01_Turma();
        
        System.out.println("Nº máx alunos: "+turma1.nroMaximoAlunos);
        System.out.println("Aluno matriculado: "+turma1.nomeAlunoMatriculado("Davi"));
        
    }
    
}
