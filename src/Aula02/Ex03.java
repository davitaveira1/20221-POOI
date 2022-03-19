/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

/**
 *
 * @author Davi
 */
import java.util.Locale;
import java.util.Scanner;
public class Ex03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double peso;
        
        System.out.print("Informe o seu peso: ");
        peso = entrada.nextDouble();
        
        System.out.println("Peso informado: "+peso);
        
    }
    
}
