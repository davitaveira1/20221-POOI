package Aula06;

public class Ex01_Conta {
    
    String nomeTitular;
    String nroConta;
    double saldo;
    
    void mostrarValoresAtributos(){
        System.out.println("Nome titular: "+nomeTitular);
        System.out.println("Número conta: "+nroConta);
        System.out.println("Saldo: "+saldo);
    }
    
    void mostrarSaldo(){
        System.out.println("Conta: "+nroConta+" Saldo: "+saldo);
    }    
    
    void creditar(double valor){
        saldo = saldo + valor;
        mostrarSaldo();
    }
    
    void debitar(double valor){
        if(saldo<valor){
            System.out.println("Operação não realizada! Saldo insuficiente!");
        }else{
            saldo = saldo - valor;
            mostrarSaldo();
        }        
    }
    
    void transferir(Ex01_Conta conta,double valor){
        if(saldo<valor){
            System.out.println("Operação não realizada! Saldo insuficiente!");
        }else{
            //creditar
            conta.saldo = conta.saldo + valor;
            System.out.println("Conta: "+conta.nroConta+" Saldo: "+conta.saldo);
            //debitar
            saldo = saldo - valor;
            System.out.println("Conta: "+nroConta+" Saldo: "+saldo);
        }
        
        
        
    }
    
   
    
}
