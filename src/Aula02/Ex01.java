package Aula02;

import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        //declarar uma variável
        Scanner entrada;
        //Instanciar um objeto
        entrada = new Scanner(System.in);
        //declarar variável nome
        String nome;
        
        System.out.println("Informe o seu nome: ");
        nome = entrada.nextLine();
        
        System.out.println("\nNome digitado: "+nome);
        
    }
    
   
}
