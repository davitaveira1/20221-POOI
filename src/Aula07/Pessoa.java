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
public class Pessoa {
    
    String nome;
    
    void filiacao(Pessoa pai,Pessoa mae){
        System.out.println("Filho: "+nome);
        System.out.println("Pai: "+pai.nome);
        System.out.println("Mãe: "+mae.nome);
    }
    
}
