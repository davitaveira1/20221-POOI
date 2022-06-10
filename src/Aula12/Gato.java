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
public class Gato extends Animal{

    private String nome;
    private String proprietario;

    public Gato(String nome) {
        this.nome = nome;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    
    
    @Override
    public void Som(){
        super.Som();
        System.out.println("Miau!");       
    }
    
}
