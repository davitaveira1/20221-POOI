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
public class Ex06 {
    
    public static void main(String[] args) {
        
        double milhas,metros,km;
        double conv_milha_metro;
        double conv_milha_km;
                
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor em milhas: ");
        milhas = entrada.nextDouble();
        
        conv_milha_metro = milhas * 1600;        
        conv_milha_km = conv_milha_metro/1000;
        
        System.out.println("Resultado : "+conv_milha_km);
        
        
        
        
    }
    
}
