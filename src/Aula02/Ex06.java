
package Aula02;

import java.util.Scanner;
public class Ex06 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        double nota;
        
        nome = entrada.next();
        idade = entrada.nextInt();
        nota = entrada.nextDouble();
        
        System.out.println("Dados digitados: ");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(nota);
        
    }
    
}
