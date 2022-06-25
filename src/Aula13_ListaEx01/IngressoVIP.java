/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula13_ListaEx01;

/**
 *
 * @author Davi
 */
public class IngressoVIP extends Ingresso{
    
    private double valorAdicional;

    public IngressoVIP() {
    }

    public IngressoVIP(double valorAdicional,double valor) {   
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    
    public void valorDoIngresso(double valorIngresso) {           
        System.out.println("IngressoVIP{valor do ingresso VIP = "+(valorIngresso+valorAdicional));
    }

    @Override
    public String toString() {
        //super();
        return "IngressoVIP{Valor final do ingresso: "+(valor+valorAdicional)+'}';
    }
    
    
    
    
    
}
