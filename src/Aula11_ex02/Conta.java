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
public class Conta {
    
    private int conta;
    private String titular;
    protected double saldo;

    public Conta() {
    }


    public Conta(int conta, String titular, double saldo) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "conta=" + conta + ", titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    public void saque(double valor){
        if(saldo >= (valor+5)){
            saldo = saldo - (valor + 5);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void deposito(double valor){
        saldo = saldo + valor;
    }
    
    
}
