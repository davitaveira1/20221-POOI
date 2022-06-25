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
public class Principal {
    
    public static void main(String[] args) {
        Empregado e = new Empregado("davi",1000);
        Gerente g = new Gerente("RH","Lucas",4000);
        Vendedor v = new Vendedor(0.5, "Fabrício", 1000);
        System.out.println(e);
        System.out.println(g);
        System.out.println(v);
    }
    
}
