/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08;

/**
 *
 * @author Davi
 */
import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor do raio: ");
        double raio = entrada.nextDouble();
        
        Calculos c1 = new Calculos();
        
        System.out.println("Valor do PI: "+c1.PI);
        System.out.println("Perímetro: "+c1.perimetro(raio));
        System.out.println("Volume: "+c1.volume(raio));
    }
    
}
