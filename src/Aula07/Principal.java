/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Conta contaDavi = new Conta();
        Conta contaLucas = new Conta();
        
        contaDavi.saldo = 1000;
        contaLucas.saldo = 0;
                
        contaDavi.transferir(contaLucas, 500);
    }
    
}
