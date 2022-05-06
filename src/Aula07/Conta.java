/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07;

/**
 *
 * @author Davi
 */
public class Conta {
    
    String nroConta;
    String agencia;
    double saldo;
    
    void mostrarNroAgencia(){
        System.out.println("Nro agencia: "+agencia);
    }
    
    void transferir(Conta contaCreditada,double valor){
        if(saldo>=valor){
            //retirando valor da conta debitada
            saldo = saldo - valor;
            //acrescentando valor na conta creditada
            contaCreditada.saldo = contaCreditada.saldo + valor;
            
            //apresentando os saldos atualizados
            System.out.println("saldo da conta debitada: "+saldo);
            System.out.println("Saldo da conta creditada: "+contaCreditada.saldo);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    
    
}
