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
public class Ex02Principal {
    
    public static void main(String[] args) {
        
        Pessoa Davi = new Pessoa();
        Pessoa Joao = new Pessoa();
        Pessoa Neide = new Pessoa();
        
        Davi.nome="Davi";
        Joao.nome="Joao";
        Neide.nome="Neide";
        
        Davi.filiacao(Joao, Neide);
    }
    
}
