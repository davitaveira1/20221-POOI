/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula13_ListaEx02;

/**
 *
 * @author Davi
 */
public class Gerente extends Empregado{
    
    private String departamento;

    public Gerente() {
    }

    public Gerente(String departamento, String nome, double salario) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" + "\nnome="+nome+"\nsalario="+salario+"\ndepartamento=" + departamento + '}';
    }
    
    
    
}
