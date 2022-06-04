/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11_ex02;

import Aula11.*;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Conta c1 = new Conta(1,"Davi",1000);
        ContaEmpresarial ce1 = new ContaEmpresarial();
        
        ce1.setConta(2);
        ce1.setTitular("Ricardo");       
        
        System.out.println(c1);
        System.out.println("Titular conta empresarial: "+ce1.getTitular());
    }
    
}
