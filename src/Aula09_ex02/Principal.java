/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09_ex02;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Davi","000.000.000-00");
        
        System.out.println("Nome: "+p1.nome);
        System.out.println("CPF: "+p1.cpf);
    }
    
}
