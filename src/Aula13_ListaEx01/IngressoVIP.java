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

    public IngressoVIP(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "IngressoVIP{" + "valor do ingresso VIP=" + valorAdicional + '}';
    }
    
    
    
}
