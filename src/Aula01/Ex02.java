package Aula01;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        //declarar
        Scanner leia;
        //instanciar (espaço na memória)
        leia = new Scanner(System.in);
        double peso;
        
        System.out.println("Informe o peso: ");
        peso = leia.nextDouble();
        
        System.out.println("Peso digitado: "+peso);
        
        
    }
    
}
