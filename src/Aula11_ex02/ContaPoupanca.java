/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11_ex02;

/**
 *
 * @author Davi
 */
public class ContaPoupanca extends Conta{
    
    @Override
    public void saque(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
}
