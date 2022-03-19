package Aula02;

import java.util.Scanner;
public class Ex05 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        int idade;
        double peso;
        
        nome = entrada.next();
        idade = entrada.nextInt();
        peso = entrada.nextDouble();
        
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        
        
        
    }
    
}
