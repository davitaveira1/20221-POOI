/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09;

/**
 *
 * @author Davi
 */
public class ex03_Pessoa {
    
    String nome;
    String cpf;
    
    ex03_Pessoa(){        
    }
    
    ex03_Pessoa(String campoNome){
        nome = campoNome;
    }
    
    ex03_Pessoa(String campoNome,String campoCpf){
        nome = campoNome;
        cpf = campoCpf;
    }
    
}
