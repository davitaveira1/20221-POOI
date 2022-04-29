package Aula06;

public class Ex01_principal {
    
    public static void main(String[] args) {
        
        Ex01_Conta conta1 = new Ex01_Conta();
        
        conta1.nomeTitular="Davi Taveira";
        conta1.nroConta="0529-0";
        conta1.saldo=1000;
        conta1.mostrarValoresAtributos();
        
        Ex01_Conta conta2 = new Ex01_Conta();
        conta2.nomeTitular="Daniel Taveira";
        conta2.nroConta="1234-0";
        conta2.saldo=2000;
        conta2.mostrarValoresAtributos();
        
        Ex01_Conta conta3 = new Ex01_Conta();
        conta3.nomeTitular="Lucas Pereira";
        conta3.nroConta="6672-0";
        conta3.saldo=500;
        conta3.mostrarValoresAtributos();
        
        Ex01_Conta conta4 = new Ex01_Conta();
        conta4.nomeTitular="Joaquim Lopes";
        conta4.nroConta="9871-0";
        conta4.saldo=5000;
        conta4.mostrarValoresAtributos();
        
        
        
    }
    
}
