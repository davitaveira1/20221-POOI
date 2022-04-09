package Aula05;

public class Ex01_Principal {
    
    public static void main(String[] args) {
        //declarar e instanciar
        Ex01_Conta conta1 = new Ex01_Conta();
        
        //inicializar atributo
        conta1.nroConta = "123-4";
        conta1.saldo = 600.00;
        
        System.out.println("Saldo: "+conta1);
        
        //declarar e instanciar
        Ex01_Conta conta2 = new Ex01_Conta();
        
        conta2.nroConta = "345-9";
        conta2.saldo = 1200.0;
        
        System.out.println("Saldo: "+conta2.saldo);
        
        //declarar e instanciar
        Ex01_Conta conta3 = new Ex01_Conta();
        
        conta3.nroConta = "199-2";
        conta3.saldo = 6200.0;
        
        System.out.println("Saldo: "+conta3.saldo); 
        
        //declarar e instanciar
        Ex01_Conta conta4 = new Ex01_Conta();
        
        conta4.nroConta = "987-2";
        conta4.saldo = 9000.0;
        
        System.out.println("Saldo: "+conta4.saldo);
        
    }
    
}
