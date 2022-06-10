/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula12;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        Gato gato = new Gato("Garfield");
        
        gato.Som();
        gato.setProprietario("Davi");
        System.out.println("nome: "+gato.getNome());
        System.out.println("proprietario: "+gato.getProprietario());
    }
    
}
