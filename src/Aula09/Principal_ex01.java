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
public class Principal_ex01 {
    
    public static void main(String[] args) {
        Turma_ex01 turma1 = new Turma_ex01();
        
        System.out.println("Nº máx alunos: "+turma1.nroMaximoAlunos);
        System.out.println("Aluno matriculado: "+turma1.nomeAlunoMatriculado("Davi"));
        
    }
    
}
