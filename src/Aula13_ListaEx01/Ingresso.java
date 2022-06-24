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
public class Ingresso {
    
    private double valor;

    public Ingresso() {
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }    
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ingresso{" + "valor=" + valor + '}';
    }
    
    
    
}
