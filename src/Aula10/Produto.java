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
public class Produto {
    
    private String nome;
    private Categoria cat;
    
    String getNome(){
        return nome;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    Categoria getCategoria(){
        return cat;
    }
    
    void setCategoria(Categoria cat){
        this.cat = cat;
    }
    
}
