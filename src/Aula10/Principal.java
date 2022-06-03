/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula10;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Categoria c1 = new Categoria();
        
        p1.setNome("TV");
        c1.setNome("Eletrodoméstico");
        
        p1.setCategoria(c1);
    }
    
}
