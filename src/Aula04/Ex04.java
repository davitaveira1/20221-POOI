/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04;

/**
 *
 * @author Davi
 */
import java.util.Scanner;
public class Ex04 {
    
    public static void main(String[] args) {
        String nome,sobrenome;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        nome = entrada.next();
        System.out.println("Informe o sobrenome: ");
        sobrenome = entrada.next();

        
        System.out.println("Valores digitados: "+nome+" "+sobrenome);
        
    }
    
}
