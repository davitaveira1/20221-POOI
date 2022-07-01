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
public class Vendedor extends Empregado{
    
    private double percentualComissao;

    public Vendedor() {
    }

    public Vendedor(double percentualComissao, String nome, double salario) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularSalario(){
        
        double salarioFinal = salario *(1+percentualComissao);        
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Vendedor{Nome do vendedor="+nome+"\nSalário sem comissão="+salario+"\nSalario final="+calcularSalario()+"\npercentualComissao=" + percentualComissao + '}';
    }
    
    
    
}
