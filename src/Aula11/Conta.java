/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11;

/**
 *
 * @author Davi
 */
public class Conta {
    
    private int conta;
    private String titular;
    private double saldo;

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
    
    
    
    
}
