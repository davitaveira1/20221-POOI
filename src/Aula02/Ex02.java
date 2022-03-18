package Aula02;

import java.util.Scanner;
public class Ex02 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mesNascimento;
        int idade;
        
        System.out.print("Informe o seu mês de nascimento:");
        mesNascimento = entrada.next();
        System.out.print("Informe a idade: ");
        idade = entrada.nextInt();
        
        System.out.println("\nMês informado: "+mesNascimento);
        System.out.println("\nIdade informada: "+idade);
        
        
    }
    
}
