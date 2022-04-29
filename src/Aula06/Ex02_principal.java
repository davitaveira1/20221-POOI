/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06;

/**
 *
 * @author Davi
 */
public class Ex02_principal {
    
    public static void main(String[] args) {
        
        Ex02_Pessoa pessoa1 = new Ex02_Pessoa();      
        pessoa1.nome = "Davi Taveira";
        pessoa1.cpf = "887990871-09";
        pessoa1.telefone = "(62)98765-0091";
        pessoa1.mostrarAtributos();
        
        Ex02_Pessoa pessoa2 = new Ex02_Pessoa(); 
        pessoa2.nome = "Fabio Lima";
        pessoa2.cpf = "123657897-00";
        pessoa2.telefone = "(62)9876-0011"; 
        pessoa2.mostrarAtributos();
        
        
    }
    
}
