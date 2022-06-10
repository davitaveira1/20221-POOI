/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula12_ex02;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        Mamifero humano = new Humano();
        Mamifero baleia = new Baleia();
        
        humano.Locomover();
        baleia.Locomover();
        
    }
    
}
