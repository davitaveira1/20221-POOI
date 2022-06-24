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
public class Principal {
    
    public static void main(String[] args) {
        
        Ingresso ing = new Ingresso(100);
        IngressoVIP ingVIP= new IngressoVIP(50);
        
        System.out.println(ing);
        //System.out.println(ingVIP);
        
        ingVIP.valorDoIngresso(ing.valor);
        
        
        
    }
    
}
