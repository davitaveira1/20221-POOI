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
public class Ex04_principal {
    
    public static void main(String[] args) {
        
        Ex02_Pessoa proprietario1 = new Ex02_Pessoa();
        proprietario1.nome="Davi";
        
        Ex04_Carro carro1 = new Ex04_Carro();
        carro1.proprietario = proprietario1;
        carro1.marca="Ford";
        carro1.modelo="Ranger";
        carro1.ano=2019;
        carro1.cor="Branco";
        carro1.placa="NKT-0900";
        carro1.preco=45000;
        carro1.mostrarAtributos();
        
    }
    
}
